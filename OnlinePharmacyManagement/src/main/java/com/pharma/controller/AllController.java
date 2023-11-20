package com.pharma.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;


import com.pharma.entities.BookMedicine;
import com.pharma.entities.Contact;
import com.pharma.services.BookMedicineService;
import com.pharma.services.ContactService;
import com.pharma.entities.Medicine;
import com.pharma.services.MedicineService;
import com.pharma.entities.UserRegister;
import com.pharma.services.UserService;





@RestController

@CrossOrigin(origins = "http://localhost:4200")
public class AllController {
	@Autowired
	private UserService userService;
	
	@Autowired
	private MedicineService medService;
	
	@Autowired
	private BookMedicineService bookmedService;
	
	@Autowired
	private ContactService contactService;
	
	
//	public static String uploadDirectory = "C:\\Users\\TANUSKA DAS\\Desktop\\Anudip Project\\OnlinePharmacyManagement\\src\\main\\webapp\\images";
//	public static String uploadDirectory = System.getProperty("user.dir") + "/src/main/webapp/images";
	
	@GetMapping("/home")
	public String home() {
		return "Welcome to Online Pharmacy Management System";
	}
	
	//GET USERS

		@GetMapping("/users")
		public List<UserRegister> getUsers(){
			return this.userService.getUsers();
		}
		
				//GET ONE USER
		@GetMapping("/users/{userId}")
		public UserRegister getUsers(@PathVariable int userId) {
			return this.userService.getUsers(userId);
		}
				//ADD NEW USERS
		@PostMapping("/user")
//		@PostMapping("/users")
		public UserRegister addUser(@RequestBody UserRegister user) {
			return this.userService.addUser(user);
		}
		
		
		
		//GET MEDICINE
		@GetMapping("/medicine")
		public List<Medicine> getmedicines(){
			return this.medService.getmedicines();		
		}
		
				//GET ONE MEDICINE
		@GetMapping("/medicine/{medicineId}")
		public Medicine getmedicines(@PathVariable int medicineId) {
			return this.medService.getmedicines(medicineId);
		}
		
		@PostMapping("/medicine")
		public Medicine addMedicine(@ModelAttribute Medicine medicine) {
//		    String originalFilename = file.getOriginalFilename();
//		    Path fileNameAndPath = (Path) Paths.get(uploadDirectory, originalFilename);
//		    Files.write(fileNameAndPath, file.getBytes());
//		    medicine.setImage(originalFilename);

		    return this.medService.addMedicine(medicine);
		}
		
				//UPDATE MEDICINE
		@PutMapping("/medicine")
		public Medicine updateMedicine(@RequestBody Medicine medicine) {
			return this.medService.updateMedicine(medicine);
		}
		
			//DELETE MEDICINE
		@DeleteMapping("/medicine/{medicineId}")
		public ResponseEntity<HttpStatus> deleteMedicine(@PathVariable int medicineId){
			try {
				this.medService.deleteMedicine(medicineId);
				return new ResponseEntity<>(HttpStatus.OK);
			} catch(Exception e) {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		

				//BOOK MEDICINE
		@GetMapping("/bookmed")
		public List<BookMedicine> getbookmed(){
			return this.bookmedService.getbookmed();
		}
		
				//GET ONE BOOK MEDICINE
		@GetMapping("/bookmed/{medId}")
		public BookMedicine getbookmed(@PathVariable int medId) {
			return this.bookmedService.getbookmed(medId);
		}
		
				//ADD BOOK MEDICINE
		@PostMapping("/bookmed")
		public BookMedicine addbookmed(@RequestBody BookMedicine medbook ) {
			
			return this.bookmedService.addbookmed(medbook);
		}
		
		//UPDATE BOOK MEDICINE
		@PutMapping("/bookmed")
		public BookMedicine updatebookmed(@RequestBody BookMedicine medbook) {
			return this.bookmedService.updatebookmed(medbook);
		}
		
		//DELETE BOOK MEDICINE
		@DeleteMapping("/bookmed/{bookmedicineId}")
			public ResponseEntity<HttpStatus> deletebookMedicine(@PathVariable int bookmedicineId){
				try {
					this.bookmedService.deletebookMedicine(bookmedicineId);
					return new ResponseEntity<>(HttpStatus.OK);
				} catch(Exception e){
					return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
				}
			}
		
		//CONTACT DETAILS
		
		@GetMapping("/contact")
		public List<Contact> getContact(){
			return this.contactService.getContact();
		}
		
		@PostMapping("/contact")
		public Contact addContact(@RequestBody Contact contact) {
			return this.contactService.addContact(contact);
		}
			
		

		

}
