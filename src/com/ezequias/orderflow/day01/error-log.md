# Error Log

## Error 1
Context: Product registration validation

Problem: I had difficulty choosing the correct order of if/else validations.

Cause: I was thinking about each condition separately instead of organizing the validation flow from invalid input to valid processing.

Fix: I placed the invalid cases first and left the successful case in the final else.

Prevention: Before coding, list all invalid cases first, then write the success path last.