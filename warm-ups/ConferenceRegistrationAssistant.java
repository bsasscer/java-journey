/**
 * Assists in guiding people to the proper line based on their last name.
 *
 * @param lastName The person's last name
 * @return The line number based on the first letter of lastName
 */

public class ConferenceRegistrationAssistant {
    public int getLineNumberFor(String lastName) {
        int lineNumber = 0;
        char firstLetter = lastName.charAt(0);
        if (firstLetter <= 'M') {
            lineNumber = 1;
        } else {
            lineNumber = 2;
        }
        /*
          lineNumber should be set based on the first character of the person's last name
          Line 1 - A thru M
          Line 2 - N thru Z

         */
        return lineNumber;
    }

}
