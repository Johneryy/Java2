package MyProjects;

import java.util.Scanner;

public class MyNokiaPhone {
    public static void main (String... args) {
        System.out.println("List of menu Functions");
        String prompt = """
                1. PhoneBook
                2. Messages
                3. Chat
                4. Call Register
                5. Tones
                6. Settings
                7. Call Divert
                8. Games
                9. Calculator
                10. Reminders
                11. Clock
                12. Profiles
                13. SIM Services
                """;
        System.out.println(prompt);

        Scanner input = new Scanner(System.in);
        int command = input.nextInt();

        switch (command) {
            case 1:
                phoneBook(input);
            case 2:
                messages(input);
            case 3: {
                System.out.println("Chat");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                command = input.nextInt();
                if (command == 0) main();
            }
            case 4:
                callRegister(input);
            case 5:
                Tones(input);
            case 6:
                Settings(input);
            case 7: {
                System.out.println("Call Divert");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                command = input.nextInt();
                if (command == 0) main();
            }
            case 8: {
                System.out.println("Games");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                command = input.nextInt();
                if (command == 0) main();
            }
            case 9: {
                System.out.println("Calculator");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                command = input.nextInt();
                if (command == 0) main();
            }
            case 10: {
                System.out.println("Reminders");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                command = input.nextInt();
                if (command == 0) main();
            }
            case 11:
                clock(input);
            case 12: {
                System.out.println("Profiles");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                command = input.nextInt();
                if (command == 0) main();
            }
            case 13: {
                System.out.println("SIM Services");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                command = input.nextInt();
                if (command == 0) main();
            }
            case 0:
                main();
            default:System.out.println();
        }
    }

    private static void clock(Scanner input) {
        System.out.println("Clock");
        String clockPrompt = """
                1. Alarm Clock
                2. Clock Settings
                3. Date Setting
                4. StopWatch
                5. Countdown Timer
                6. Auto Update  Of Date And Time
                0. Back
                """;
        System.out.println(clockPrompt);
        int command = input.nextInt();
        String prompt;
        switch (command) {
            case 1: {
                System.out.println("Alarm Clock");
                prompt = "0. Back\n";
                System.out.println(prompt);
                command = input.nextInt();
                if (command == 0) {
                    clock(input);
                }
            }
            case 2: {
                System.out.println("Clock Settings");
                prompt = "0. Back\n";
                System.out.println(prompt);
                command = input.nextInt();
                if (command == 0) {
                    clock(input);
                }
            }
            case 3: {
                System.out.println("Date Settings");
                prompt = "0. Back\n";
                System.out.println(prompt);
                command = input.nextInt();
                if (command == 0) {
                    clock(input);
                }
            }
            case 4: {
                System.out.println("StopWatch");
                prompt = "0. Back\n";
                System.out.println(prompt);
                command = input.nextInt();
                if (command == 0) {
                    clock(input);
                }
            }
            case 5: {
                System.out.println("CountDown Timer");
                prompt = "0. Back\n";
                System.out.println(prompt);
                command = input.nextInt();
                if (command == 0) {
                    clock(input);
                }
            }
            case 6: {
                System.out.println("Auto Update Of Date And Time");
                prompt = "0. Back\n";
                System.out.println(prompt);
                command = input.nextInt();
                if (command ==0) {
                    clock(input);
                }
            }
            case 0: main();
            default:System.out.println("Invalid");
        }
    }

    private static void Settings(Scanner input) {
        System.out.println("Settings");
        String settingsPrompt = """
                1. Call Settings
                2. Phone Settings
                3. Security Settings
                4. Restore Factory Settings
                0. Back
                """;
        System.out.println(settingsPrompt);
        int command = input.nextInt();
        String prompt;
        switch (command) {
            case 1:
                callSettings(input);
            case 2:
                phoneSettings(input);
            case 3:
                securitySettings(input);
            case 4: {
                System.out.println("Restore Factory Settings");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                command = input.nextInt();
                if (command == 0) main();
            }
            case 0: main();
            default:System.out.println("Invalid");
        }
    }

    private static void securitySettings(Scanner input) {
        System.out.println("Security Settings");
        String settingsPrompt = """
                1. Pin Code Request
                2. Call Barring Service
                3. Fixed Dialling
                4. Closed User Group
                5. Phone Security
                6. Change Access Codes
                0. Back
                """;
        System.out.println(settingsPrompt);
        int command = input.nextInt();
        String prompt;
        switch (command) {
            case 1: {
                System.out.println("Pin Code Request");
                prompt = "0. Back\n";
                System.out.println(prompt);
                command = input.nextInt();
                if (command == 0) {
                    Settings(input);
                }
            }
            case 2: {
                System.out.println("Call Barring Service");
                prompt = "0. Back\n";
                System.out.println(prompt);
                command = input.nextInt();
                if (command == 0) {
                    Settings(input);
                }
            }
            case 3: {
                System.out.println("Fixed Dialling");
                prompt = "0. Back\n";
                System.out.println(prompt);
                command = input.nextInt();
                if (command == 0) {
                    Settings(input);
                }
            }
            case 4: {
                System.out.println("Closed User Group");
                prompt = "0. Back\n";
                System.out.println(prompt);
                command = input.nextInt();
                if (command == 0) {
                    Settings(input);
                }
            }
            case 5: {
                System.out.println("Phone Security");
                prompt = "0. Back\n";
                System.out.println(prompt);
                command = input.nextInt();
                if (command == 0) {
                    Settings(input);
                }
            }
            case 6: {
                System.out.println("Change Access Codes");
                prompt = "0. Back\n";
                System.out.println(prompt);
                command = input.nextInt();
                if (command ==0) {
                    Settings(input);
                }
            }
            case 0: main();
            default:System.out.println("Invalid");
        }
    }

    private static void phoneSettings(Scanner input) {
        System.out.println("Phone Settings");
        String settingsPrompt = """
                1. Language
                2. Cell Info Display
                3. Welcome Note
                4. Network Selection
                5. Lights
                6. Confirm SIM Service Options
                0. Back
                """;
        System.out.println(settingsPrompt);
        int command = input.nextInt();
        String prompt;
        switch (command) {
            case 1: {
                System.out.println("Language");
                prompt = "0. Back\n";
                System.out.println(prompt);
                command = input.nextInt();
                if (command == 0) {
                    Settings(input);
                }
            }
            case 2: {
                System.out.println("Cell Info Display");
                prompt = "0. Back\n";
                System.out.println(prompt);
                command = input.nextInt();
                if (command == 0) {
                    Settings(input);
                }
            }
            case 3: {
                System.out.println("Welcome Note");
                prompt = "0. Back\n";
                System.out.println(prompt);
                command = input.nextInt();
                if (command == 0) {
                    Settings(input);
                }
            }
            case 4: {
                System.out.println("Network Selection");
                prompt = "0. Back\n";
                System.out.println(prompt);
                command = input.nextInt();
                if (command == 0) {
                    Settings(input);
                }
            }
            case 5: {
                System.out.println("Lights");
                prompt = "0. Back\n";
                System.out.println(prompt);
                command = input.nextInt();
                if (command == 0) {
                    Settings(input);
                }
            }
            case 6: {
                System.out.println("Confirm SIM Service Actions");
                prompt = "0. Back\n";
                System.out.println(prompt);
                command = input.nextInt();
                if (command ==0) {
                    Settings(input);
                }
            }
            case 0: main();
            default:System.out.println("Invalid");
        }
    }

    private static void callSettings(Scanner input) {
        System.out.println("Call Settings");
        String settingsPrompt = """
                1. Automatic Redial
                2. Speed Dialling
                3. Call Waiting Options
                4. Own Number Sending
                5. Phone Line In Use
                6. Automatic Answer
                0. Back
                """;
        System.out.println(settingsPrompt);
        int command = input.nextInt();
        String prompt;
        switch (command) {
            case 1: {
                System.out.println("Automatic Redial");
                prompt = "0. Back\n";
                System.out.println(prompt);
                command = input.nextInt();
                if (command == 0) {
                    Settings(input);
                }
            }
            case 2: {
                System.out.println("Speed Dialling");
                prompt = "0. Back\n";
                System.out.println(prompt);
                command = input.nextInt();
                if (command == 0) {
                    Settings(input);
                }
            }
            case 3: {
                System.out.println("Call Waiting Options");
                prompt = "0. Back\n";
                System.out.println(prompt);
                command = input.nextInt();
                if (command == 0) {
                    Settings(input);
                }
            }
            case 4: {
                System.out.println("Own Number Sending");
                prompt = "0. Back\n";
                System.out.println(prompt);
                command = input.nextInt();
                if (command == 0) {
                    Settings(input);
                }
            }
            case 5: {
                System.out.println("Phone Line In Use");
                prompt = "0. Back\n";
                System.out.println(prompt);
                command = input.nextInt();
                if (command == 0) {
                    Settings(input);
                }
            }
            case 6: {
                System.out.println("Automatic Answer");
                prompt = "0. Back\n";
                System.out.println(prompt);
                command = input.nextInt();
                if (command ==0) {
                    Settings(input);
                }
            }
            case 0: main();
            default:System.out.println("invalid");
        }
    }

    private static void Tones(Scanner input) {
        System.out.println("Tones");
        String tonesPrompt = """
                1. Ringing Tone
                2. Ringing Volume
                3. Incoming Alert
                4. Composer
                5. Message Alert Tone
                6. Keypad tones
                7. Warning and game tones
                8. Vibrating alert
                9. Screen Saver
                0. Back
                """;
        System.out.println(tonesPrompt);
        int command = input.nextInt();
        String prompt;
        switch (command) {
            case 1: {
                System.out.println("Ringing Tone");
                prompt = "0. Back\n";
                System.out.println(prompt);
                command = input.nextInt();
                if (command ==0) {
                    Tones(input);
                }
            }
            case 2: {
                System.out.println("Ringing Volume");
                prompt = "0. Back\n";
                System.out.println(prompt);
                command = input.nextInt();
                if (command ==0) {
                    Tones(input);
                }
            }
            case 3: {
                System.out.println("Incoming Call Alert");
                prompt = "0. Back\n";
                System.out.println(prompt);
                command = input.nextInt();
                if (command ==0) {
                    Tones(input);
                }
            }
            case 4: {
                System.out.println("Composer");
                prompt = "0. Back\n";
                System.out.println(prompt);
                command = input.nextInt();
                if (command ==0) {
                    Tones(input);
                }
            }
            case 5: {
                System.out.println("Message Alert Tone");
                prompt = "0. Back\n";
                System.out.println(prompt);
                command = input.nextInt();
                if (command ==0) {
                    Tones(input);
                }
            }
            case 6: {
                System.out.println("Keypad Tones");
                prompt = "0. Back\n";
                System.out.println(prompt);
                command = input.nextInt();
                if (command ==0) {
                    Tones(input);
                }
            }
            case 7: {
                System.out.println("Warning and game tones");
                prompt = "0. Back\n";
                System.out.println(prompt);
                command = input.nextInt();
                if (command ==0) {
                    Tones(input);
                }
            }
            case 8: {
                System.out.println("Vibrating Alert");
                prompt = "0. Back\n";
                System.out.println(prompt);
                command = input.nextInt();
                if (command ==0) {
                    Tones(input);
                }
            }
            case 9: {
                System.out.println("Screen Saver");
                prompt = "0. Back\n";
                System.out.println(prompt);
                command = input.nextInt();
                if (command ==0) {
                    Tones(input);
                }
            }
            case 0: main();
            default:System.out.println("Invalid");
        }
    }

    private static void callRegister(Scanner input) {
        System.out.println("Call Register");
        String callRegisterPrompt = """
                1. Missed Calls
                2. Received Calls
                3. Dialled Numbers
                4. Erase Recent Call Lists
                5. Show Calls Duration
                6. Show Call Cost
                7. Call cost Settings
                8. Prepaid Credit
                0. Back
                """;
        System.out.println(callRegisterPrompt);
        int command = input.nextInt();
        String prompt;
        switch (command) {
            case 1: {
                System.out.println("Missed Calls");
                prompt = "0. Back\n";
                System.out.println(prompt);
                command = input.nextInt();
                if (command ==0) {
                    callRegister(input);
                }
            }
            case 2: {
                System.out.println("Received Calls");
                prompt = "0. Back\n";
                System.out.println(prompt);
                command = input.nextInt();
                if (command ==0) {
                    callRegister(input);
                }
            }
            case 3: {
                System.out.println("Dialled Numbers");
                prompt = "0. Back\n";
                System.out.println(prompt);
                command = input.nextInt();
                if (command ==0) {
                    callRegister(input);
                }
            }
            case 4: {
                System.out.println("Erase Recent Calls List");
                prompt = "0. Back\n";
                System.out.println(prompt);
                command = input.nextInt();
                if (command ==0) {
                    callRegister(input);
                }
            }
            case 5: showCallDuration(input);
            case 6: showCallCosts(input);
            case 7: callCostSettings(input);
            case 8: {
                System.out.println("Prepaid");
                prompt = "0. Back\n";
                System.out.println(prompt);
                command = input.nextInt();
                if (command ==0) {
                    callRegister(input);
                }
            }
            case 0: main();
            default: System.out.println("Invalid");
        }
    }


    private static void callCostSettings(Scanner input) {
        int command;
        String prompt;
        System.out.println("Call Cost Settings");
        prompt = """
                1. Call Cost Limit
                2. Show Costs In
                0. Back
                """;
        System.out.println(prompt);
        command = input.nextInt();
        switch (command) {
            case 1: {
                System.out.println("call cost limit");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                command = input.nextInt();
                if (command ==0) {
                    showCallDuration(input);
                }
            }
            case 2: {
                System.out.println("Show Costs In");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                command = input.nextInt();
                if (command ==0) {
                    showCallDuration(input);
                }
            }
            case 0: callRegister(input);
        }
    }


    private static void showCallCosts(Scanner input) {
        int command;
        String prompt;
        System.out.println("Show call costs");
        prompt = """
                1. Last Call Cost
                2. All Calls Cost
                3. Clear Counters
                0. Back
                """;
        System.out.println(prompt);
        command = input.nextInt();
        switch (command) {
            case 1: {
                System.out.println("Last call cost");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                command = input.nextInt();
                if (command ==0) {
                    showCallDuration(input);
                }
            }
            case 2: {
                System.out.println("All calls cost");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                command = input.nextInt();
                if (command ==0) {
                    showCallDuration(input);
                }
            }
            case 3: {
                System.out.println("Clear counters");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                command = input.nextInt();
                if (command ==0) {
                    showCallDuration(input);
                }
            }
            case 0: callRegister(input);
        }
    }

    private static void showCallDuration(Scanner input) {
        int command;
        String prompt;
        System.out.println("Show call duration");
        prompt = """
                1. Last Call Duration
                2. All Calls Duration
                3. Received Calls Duration
                4. Dialled Calls Duration
                5. Clear Timers
                0. Back
                """;
        System.out.println(prompt);
        command = input.nextInt();
        switch (command) {
            case 1: {
                System.out.println("Last call duration");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                command = input.nextInt();
                if (command ==0) {
                    showCallDuration(input);
                }
            }
            case 2: {
                System.out.println("All Calls Duration");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                command = input.nextInt();
                if (command ==0) {
                    showCallDuration(input);
                }
            }
            case 3: {
                System.out.println("Received calls duration");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                command = input.nextInt();
                if (command ==0) {
                    showCallDuration(input);
                }
            }
            case 4: {
                System.out.println("Dialled calls duration");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                command = input.nextInt();
                if (command ==0) {
                    showCallDuration(input);
                }
            }
            case 5: {
                System.out.println("Clear Timers");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                command = input.nextInt();
                if (command ==0) {
                    showCallDuration(input);
                }
            }
            case 0: callRegister(input);
        }
    }


    private static void messages(Scanner input) {
        System.out.println("Messages");
        String messagesPrompt = """
                1. Write Messages
                2. Inbox
                3. OutBox
                4. Picture Messages
                5. Templates
                6. Smileys
                7. Message Settings
                8. Info Service
                9. Voice MailBox
                10. Service Command Editor
                0. Back
                """;
        System.out.println(messagesPrompt);
        int command = input.nextInt();
        String prompt;
        switch (command) {
            case 1: {
                System.out.println("Write Messages");
                prompt = "0. Back\n";
                System.out.println(prompt);
                command = input.nextInt();
                if (command ==0) {
                    messages(input);
                }
            }
            case 2: {
                System.out.println("Inbox");
                prompt = "0. Back\n";
                System.out.println(prompt);
                command = input.nextInt();
                if (command ==0) {
                    messages(input);
                }
            }
            case 3: {
                System.out.println("Outbox");
                prompt = "0. Back\n";
                System.out.println(prompt);
                command = input.nextInt();
                if (command ==0) {
                    messages(input);
                }
            }
            case 4: {
                System.out.println("Picture Messages");
                prompt = "0. Back\n";
                System.out.println(prompt);
                command = input.nextInt();
                if (command ==0) {
                    messages(input);
                }
            }
            case 5: {
                System.out.println("Templates");
                prompt = "0. Back\n";
                System.out.println(prompt);
                command = input.nextInt();
                if (command ==0) {
                    messages(input);
                }
            }
            case 6: {
                System.out.println("Smileys");
                prompt = "0. Back\n";
                System.out.println(prompt);
                command = input.nextInt();
                if (command ==0) {
                    messages(input);
                }
            }
            case 7: messageSettings(input);
            case 8:
                System.out.println("info service");
                prompt = "0. Back\n";
                System.out.println(prompt);
                command = input.nextInt();
                if (command ==0) {
                    messages(input);
                }
            case 9:
                System.out.println("Voice Mailbox Number");
                prompt = "0. Back\n";
                System.out.println(prompt);
                command = input.nextInt();
                if (command ==0) {
                    messages(input);
                }
            case 10:
                System.out.println("Service Command Editor");
                prompt = "0. Back\n";
                System.out.println(prompt);
                command = input.nextInt();
                if (command ==0) {
                    messages(input);
                }
            case 0: main();
            default: System.out.println("Invalid");
        }
    }

    private static void messageSettings(Scanner input) {
        System.out.println("Message Settings");
        String messageSettingsPrompt = """
                1. Set 1
                2. Commons
                0. Back
                """;
        System.out.println(messageSettingsPrompt);
        int command = input.nextInt();
        String prompt;
        switch (command) {
            case 1: {
                System.out.println("Set 1");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                command = input.nextInt();
                if (command ==0) {
                    messageSettings(input);
                }
            }
            case 2: {
                System.out.println("Commons");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                command = input.nextInt();
                if (command ==0) {
                    messageSettings(input);
                }
            }
            case 0: messages(input);
        }

    }

    private static void phoneBook(Scanner input) {
        System.out.println("PhoneBook");
        String phoneBookPrompt = """
                1. Search
                2. Service Nos.
                3. Add Name
                4. Erase
                5. Edit
                6. Assign tone
                7. Send b' Card
                8. Options
                9. Speed Dials
                10. Voice Tags
                0. Back
                """;
        System.out.println(phoneBookPrompt);
        int command = input.nextInt();
        String prompt;
        switch (command) {
            case 1:{
            System.out.println("Search");
            prompt = "0. Back\n";
            System.out.println(prompt);
            command = input.nextInt();
            if (command ==0) {
                phoneBook(input);
            }
        }
        case 2: {
            System.out.println("Service Nos.");
            prompt = "0. Back\n";
            System.out.println(prompt);
            command = input.nextInt();
            if(command ==0) {
                phoneBook(input);
            }
        }
            case 3: {
                System.out.println("Add Name");
                prompt = "0. Back\n";
                System.out.println(prompt);
                command = input.nextInt();
                if(command ==0) {
                    phoneBook(input);
                }
            }
            case 4: {
                System.out.println("Erase");
                prompt = "0. Back\n";
                System.out.println(prompt);
                command = input.nextInt();
                if(command ==0) {
                    phoneBook(input);
                }
            }
            case 5: {
                System.out.println("Edit");
                prompt = "0. Back\n";
                System.out.println(prompt);
                command = input.nextInt();
                if(command ==0) {
                    phoneBook(input);
                }
            }
            case 6: {
                System.out.println("Assign Tone");
                prompt = "0. Back\n";
                System.out.println(prompt);
                command = input.nextInt();
                if(command ==0) {
                    phoneBook(input);
                }
            }
            case 7: {
                System.out.println("Send b' Card");
                prompt = "0. Back\n";
                System.out.println(prompt);
                command = input.nextInt();
                if(command ==0) {
                    phoneBook(input);
                }
            }
            case 8: options(input);
            case 9: {
                System.out.println("Speed");
                prompt = "0. Back\n";
                System.out.println(prompt);
                command = input.nextInt();
                if (command ==0) {
                    phoneBook(input);
                }
            }
            case 10: {
                System.out.println("Voice Tags");
                prompt = "0. Back\n";
                System.out.println(prompt);
                command = input.nextInt();
                if (command ==0) {
                    phoneBook(input);
                }
            }
            case 0 : main();
            default: System.out.println("Invalid");

        }

    }

    private static void options(Scanner input) {
        int command;
        String prompt;
        System.out.println("Options");
        prompt = """
                1. Type of view
                2. Memory Status
                0. Back
                """;
        System.out.println(prompt);
        command = input.nextInt();
        switch (command) {
            case 1: {
                System.out.println("Type of view");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                command = input.nextInt();
                if (command ==0) {
                    options(input);
                }
            }
            case 2: {
                System.out.println("Memory Status");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                command = input.nextInt();
                if (command ==0) {
                    options(input);
                }
            }
            case 0: phoneBook(input);

        }
    }
}
