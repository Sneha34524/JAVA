package com.application.first;

public class VendorDetails extends UserDetails implements Services {
	@Override
	public void basicDetails() {
		String vendorName = "Lily Potter";
		String role = "Vendor";
		String vendorAddress = "Guindy";
		String vendorPhoneNo = "98989886548";
		boolean vendorAvailablity = true;
		if ( vendorAvailablity == true) {
			System.out.println("Vendor is online");
		}
		else {
			System.out.println(" Vendor is offline");
		}
		System.out.println("Vendor Name: " + vendorName + "| " + "Role: " + role + "| " + "Vendor Address: " + vendorAddress + "| " + "Vendor Contact: " + vendorPhoneNo + "| " + "Availability: " + vendorAvailablity + " ");
	
	}
	@Override
	public void plannedService() {
		boolean plannedService = true;
		if (!plannedService) {
			System.out.println("Planned Services are available");
		}
		
	}

	@Override
	public void emergencyService() {
		boolean emergencyService = true;
		if ( emergencyService == true) {
			System.out.println("Emergency Services are available" );
		}
	}
		
	@Override
	public void vehicleType() {
		String [] vehicleTypes = {"Car", "Bike", "Cycle", "Electric Bike"};
		System.out.println("Services available in the garage are: ");
		for (int i = 0; i < vehicleTypes.length; i++) {
			System.out.println(vehicleTypes[i]);
		}
	}
	}
	


