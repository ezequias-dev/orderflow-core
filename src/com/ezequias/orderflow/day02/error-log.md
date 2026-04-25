# Error Log

## Error 2
Context: Product name input

Problem: I forgot to remove extra spaces from the product name.

Cause: I used scanner.nextLine() without trim().

Fix: Changed it to scanner.nextLine().trim().

Prevention: Whenever reading text input from the user, trim the value before validating it.