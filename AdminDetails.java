package com.application.first;

public class AdminDetails extends VendorDetails{
	@Override
	public void basicDetails() {
		String adminName = "Admin Dumbledore";
		String role = "Admin";
		String adminAddress = "Main Admin Office";
		String adminPhoneNo = "9898989898";
		boolean adminAvailablity = true;
		if ( adminAvailablity == true) {
			System.out.println("Admin is online");
		}
		else {
			System.out.println("Admin is offline");
		}
		System.out.println("Admin Name: " + adminName + "| " + "Role: " + role + "| " + "Admin Address: " + adminAddress + "| " + "Admin Contact: " + adminPhoneNo + "| " + "Availability: " + adminAvailablity + " ");
	
	}
		public static void main (String [] args) {
		AdminDetails admin = new AdminDetails();
		VendorDetails vendor = new VendorDetails();
		UserDetails user = new UserDetails();
		admin.basicDetails();
		vendor.basicDetails();
		vendor.plannedService();
		vendor.emergencyService();
		vendor.vehicleType();
		user.basicDetails();
		user.plannedService();
		user.emergencyService();
		user.vehicleType();
	}
}
