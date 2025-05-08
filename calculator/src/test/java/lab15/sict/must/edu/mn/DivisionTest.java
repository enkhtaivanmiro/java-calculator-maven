@Test
void testDivideByZero() {
    Division calc = new Division();
    Exception exception = assertThrows(IllegalArgumentException.class, 
        () -> calc.divide(4.0, 0.0),
        "Dividing by zero should throw IllegalArgumentException");
    assertEquals("Cannot divide by zero. Division operation is undefined.", 
        exception.getMessage());
}