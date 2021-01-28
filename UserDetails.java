package com.application.first;

public class UserDetails implements Services {

	public void basicDetails() {
		String userName = "Harry Potter";
		String role = "User";
		String userAddress = "Thoraipakkam";
		String userPhoneNo = "9532678998";
		boolean userAvailablity = false;
		if (userAvailablity == true) {
			System.out.println("User is online");
		} else {
			System.out.println("User is offline");
		}
		System.out.println("User Name: " + userName + "| " + "Role: " + role + "| " + "User Address: " + userAddress
				+ "| " + "User Contact: " + userPhoneNo + "| " + "Availability: " + userAvailablity + " ");

	}

	@Override
	public void plannedService() {
		boolean plannedService = false;
		if (plannedService == true) {
			System.out.println("I am opting for Planned Service");
		}

	}

	@Override
	public void emergencyService() {
		boolean emergencyService = true;
		if (emergencyService == true) {
			System.out.println("Emergency Service Required Immediately!");
		}
	}

	@Override
	public void vehicleType() {
		String vehicleTypes = "Bike";
		String vehicleNo = "TN 1631";
		System.out.println("Wanted Services:");
		String wantedServices[] = { "Tyre Services" };
		for (int i = 0; i < wantedServices.length; i++) {
			System.out.println(wantedServices[i]);
		}
	}
}