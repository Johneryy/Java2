package MyProjects;

import java.util.Scanner;

public class NokiaPhone {
    public static void main(String... args) {
        System.out.println("List of Menu Functions");
        System.out.println("Press 1 for PhoneBook");
        System.out.println("Press 2 for Messages");
        System.out.println("Press 3 for Chat");
        System.out.println("Press 4 for Call Register");
        System.out.println("Press 5 for Tones");
        System.out.println("Press 6 for Settings");
        System.out.println("Press 7 for Call Divert");
        System.out.println("Press 8 for Games");
        System.out.println("Press 9 for Calculator");
        System.out.println("Press 10 for Reminders");
        System.out.println("Press 11 for Clock");
        System.out.println("Press 12 for Profiles");
        System.out.println("Press 13 for Sim Services");

        Scanner input = new Scanner(System.in);
        int command = input.nextInt();

        switch (command) {
            case 1:
                System.out.println("Press 1 for Search");
                System.out.println("Press 2 for Service Nos.");
                System.out.println("Press 3 for Add Name");
                System.out.println("Press 4 for Call Erase");
                System.out.println("Press 5 for Edit");
                System.out.println("Press 6 for Assign Tone");
                System.out.println("Press 7 for Send b' card");
                System.out.println("Press 8 for Options");
                command = input.nextInt();
                switch (command) {
                    case 1:
                        System.out.println("Search");
                        break;
                    case 2:
                        System.out.println("Service Nos.");
                        break;
                    case 3:
                        System.out.println("Add Name");
                        break;
                    case 4:
                        System.out.println("Call Erase");
                        break;
                    case 5:
                        System.out.println("Edit");
                        break;
                    case 6:
                        System.out.println("Assign Tone");
                        break;
                    case 7:
                        System.out.println("Send b' card");
                        break;
                    case 8:
                        System.out.println("Options");
                        System.out.println("Enter 1 or 2");
                        command = input.nextInt();
                        switch(command) {
                            case 1:
                                System.out.println("Type of view");
                                break;
                            case 2:
                                System.out.println("Memory Status");
                                break;
                        }
                        break;
                    case 9:
                        System.out.println("Speed Dials");
                        break;
                    case 10:
                        System.out.println("Voice Tags");
                        break;
                }
                break;

            case 2:
                System.out.println("Press 1 for Write Messages");
                System.out.println("Press 2 for Inbox");
                System.out.println("Press 3 for Outbox");
                System.out.println("Press 4 for Picture Messages");
                System.out.println("Press 5 for Templates");
                System.out.println("Press 6 for Smileys");
                System.out.println("Press 7 for Message Settings");
                System.out.println("Press 8 for Info Service");
                System.out.println("Press 9 for Voice mailbox number");
                System.out.println("Press 10 for Service Command editor");
                command = input.nextInt();
                switch (command) {
                    case 1:
                        System.out.println("Write Messages");
                        break;
                    case 2:
                        System.out.println("Inbox");
                        break;
                    case 3:
                        System.out.println("Outbox");
                        break;
                    case 4:
                        System.out.println("Messages");
                        break;
                    case 5:
                        System.out.println("Templates");
                        break;
                    case 6:
                        System.out.println("Smileys");
                        break;
                    case 7:
                        System.out.println("Enter 1 for Set 1");
                        System.out.println("Enter 2 for Common");
                        command = input.nextInt();
                        switch(command) {
                            case 1:
                            System.out.println("Enter 1 for Set 1");
                            System.out.println("Enter 2 for Common ");
                            command = input.nextInt();
                            switch(command) {
                                case 1:
                                    System.out.println("Message Center Number");
                                    break;
                                case 2:
                                    System.out.println("Message Sent As");
                                    break;
                                case 3:
                                    System.out.println("Message Validity");
                            }
                            break;
                            case 2:
                                System.out.println("Enter 1 for Delivery Reports");
                                System.out.println("Enter 2 for Reply via same center");
                                System.out.println("Enter 3 for Character support");
                                command = input.nextInt();
                                switch(command) {
                                    case 1:
                                        System.out.println("Delivery Reports");
                                        break;
                                    case 2:
                                        System.out.println("Reply Via Same Center");
                                        break;
                                    case 3:
                                        System.out.println("Character Support");
                                        break;
                                }
                        }
                        break;
                    case 8:
                        System.out.println("Info Service");
                        break;
                    case 9:
                        System.out.println("Voice mailbox number");
                        break;
                    case 10:
                        System.out.println("Service Command editor");
                        break;
                }
                break;

            case 3:
                System.out.print("Chat");
                break;

            case 4:
                System.out.println("Press 1 for Missed Calls");
                System.out.println("Press 2 for Received Calls");
                System.out.println("Press 3 for Dialled Numbers");
                System.out.println("Press 4 for Erase Recent Call Lists");
                System.out.println("Press 5 for Show Call Duration");
                System.out.println("Press 6 for Show Call costs");
                System.out.println("Press 7 for Call cost settings");
                System.out.println("Press 8 for Prepaid Credit");
                command = input.nextInt();
                switch (command) {
                    case 1:
                        System.out.println("Press 1 for Missed Calls");
                        break;
                    case 2:
                        System.out.println("Press 2 for Received Calls");
                        break;
                    case 3:
                        System.out.println("Press 3 for Dialled Numbers");
                        break;
                    case 4:
                        System.out.println("Press 4 for Erase Recent Call Lists");
                        break;
                    case 5:
                        System.out.println("Enter 1 for Last Call Duration");
                        System.out.println("Enter 2 for All Calls' Duration");
                        System.out.println("Enter 3 for Received Calls Duration");
                        System.out.println("Enter 4 for Dialled Calls Duration");
                        System.out.println("Enter 5 for Clear Timers");
                        command = input.nextInt();
                        switch (command) {
                            case 1:
                                System.out.println("Last Call Duration");
                                break;
                            case 2:
                                System.out.println("All Calls Duration");
                                break;
                            case 3:
                                System.out.println("Received calls Duration");
                                break;
                            case 4:
                                System.out.println("Dialled calls duration");
                                break;
                            case 5:
                                System.out.println("Clear Timers");
                                break;
                        }
                        break;
                    case 6:
                        System.out.println("Press 1 for Last Call costs");
                        System.out.println("Press 2 for All Calls costs");
                        System.out.println("Press 3 for Clear counters");

                        command = input.nextInt();
                        switch (command) {
                            case 1:
                                System.out.println("Last call cost");
                                break;
                            case 2:
                                System.out.println("All calls cost");
                                break;
                            case 3:
                                System.out.println("Clear counters");
                                break;
                        }

                        break;
                    case 7:
                        System.out.println("Press 1 for Call Cost Limit");
                        System.out.println("Press 2 for Show costs in");
                        command = input.nextInt();
                        switch (command) {
                            case 1:
                                System.out.println("Call cost limit");
                                break;
                            case 2:
                                System.out.println("Show costs in");
                                break;
                        }
                        break;
                    case 8:
                        System.out.println("Press 8 for Prepaid Credit");
                        break;
                }
                break;

            case 5:
                System.out.println("Press 1 for Ringing tone");
                System.out.println("Press 2 for Ringing Volume");
                System.out.println("Press 3 for Incoming Call Alert");
                System.out.println("Press 4 for Composer");
                System.out.println("Press 5 for Message Alert Tone");
                System.out.println("Press 6 for Keypad Tones");
                System.out.println("Press 7 for Warning and Game tones");
                System.out.println("Press 8 for Vibrating alert");
                System.out.println("Press 9 for Screen Saver");
                command = input.nextInt();
                switch (command) {
                    case 1:
                        System.out.println("Press 1 for Ringing tone");
                        break;
                    case 2:
                        System.out.println("Press 2 for Ringing volume");
                        break;
                    case 3:
                        System.out.println("Press 3 for Incoming Call Alert");
                        break;
                    case 4:
                        System.out.println("Press 4 for Composer");
                        break;
                    case 5:
                        System.out.println("Press 5 for Message Alert Tone");
                        break;
                    case 6:
                        System.out.println("Press 6 for Keypad Tones");
                        break;
                    case 7:
                        System.out.println("Press 7 for Warning and Game tones");
                        break;
                    case 8:
                        System.out.println("Press 8 for Vibrating alert");
                        break;
                    case 9:
                        System.out.println("Press 9 for Screen Saver");
                        break;
                }
                break;

            case 6:
                System.out.println("Press 1 for Call Settings");
                System.out.println("Press 2 for Phone Settings");
                System.out.println("Press 3 for Security Settings");
                System.out.println("Press 4 for Restore Factory Settings");
                command = input.nextInt();
                switch (command) {
                    case 1:
                        System.out.println("Press 1 for Call Settings");
                        System.out.println("Press 2 for Phone Settings");
                        System.out.println("Press 3 for Security Settings");
                        System.out.println("Press 4 for Restore Factory Settings");
                        command = input.nextInt();
                        switch (command) {
                            case 1:
                                System.out.println("Automatic Redial");
                                break;
                            case 2:
                                System.out.println("Speed Dialing");
                                break;
                            case 3:
                                System.out.println("Call Waiting Options");
                                break;
                            case 4:
                                System.out.println("Own Number Sending");
                                break;
                            case 5:
                                System.out.println("Phone line in use");
                                break;
                            case 6:
                                System.out.println("Automatic answer");
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("Press 1 for Language");
                        System.out.println("Press 2 for Cell Phone Display");
                        System.out.println("Press 3 for Welcome Note");
                        System.out.println("Press 4 for Network Selection");
                        System.out.println("Press 5 for Lights");
                        System.out.println("Press 6 for Confirm sim service actions");
                        command = input.nextInt();
                        switch (command) {
                            case 1:
                                System.out.println("Language");
                                break;
                            case 2:
                                System.out.println("Cell Phone Display");
                                break;
                            case 3:
                                System.out.println("Welcome Note");
                                break;
                            case 4:
                                System.out.println("Network Selection");
                                break;
                            case 5:
                                System.out.println("Lights");
                                break;
                            case 6:
                                System.out.println("Confirm sim service actions");
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("Press 1 for Pin code request");
                        System.out.println("Press 2 for Call barring service");
                        System.out.println("Press 3 for Fixed Dialling");
                        System.out.println("Press 4 for Closed user group");
                        System.out.println("Press 5 for Phone Security");
                        System.out.println("Press 6 for Change Access codes");
                        command = input.nextInt();
                        switch (command) {
                            case 1:
                                System.out.println("Pin code request");
                                break;
                            case 2:
                                System.out.println("Call barring service");
                                break;
                            case 3:
                                System.out.println("Fixed Dialling");
                                break;
                            case 4:
                                System.out.println("Closed user group");
                                break;
                            case 5:
                                System.out.println("Phone Security");
                                break;
                            case 6:
                                System.out.println("Change Access Codes");
                                break;
                        }
                        break;
                    case 4:
                        System.out.println(" Restore Factory Settings");
                        break;
                }
                break;
            case 7:
                System.out.println("Call Divert");
                break;

            case 8:
                System.out.println("Games");
                break;

            case 9:
                System.out.println("Calculator");
                break;

            case 10:
                System.out.println("Reminders");
                break;

            case 11:
                System.out.println("Press 1 for Alarm Clock");
                System.out.println("Press 2 for Clock Settings");
                System.out.println("Press 3 for Data Setting");
                System.out.println("Press 4 for Stop Watch");
                System.out.println("Press 5 for Countdown timer");
                System.out.println("Press 6 for Auto update of date and time");
                command = input.nextInt();
                switch (command) {
                    case 1:
                        System.out.println("Press 1 for Missed Calls");
                        break;
                    case 2:
                        System.out.println("Press 2 for Received Calls");
                        break;
                    case 3:
                        System.out.println("Press 3 for Dialled Numbers");
                        break;
                    case 4:
                        System.out.println("Press 4 for Erase Recent Call Lists");
                        break;
                    case 5:
                        System.out.println("Press 5 for Show Call Duration");
                        break;
                    case 6:
                        System.out.println("Press 6 for Show Call costs");
                        break;
                }
                break;
            case 12:
                System.out.println("Profiles");
                break;

            case 13:
                System.out.println("Sim Services");
                break;
        }

    }
}

