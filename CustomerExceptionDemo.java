class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}

public class CustomerExceptionDemo{
        public static void main(String[] arge){
            try{
                int age = 15;

                if(age<18){
                    throw new InvalidAgeException(
                        "Age must be 18 orr older"
                    );
                }
            System.out.println("Registration successful");

            }catch(InvalidAgeException e){
                 System.out.println("error : " + e.getMessage());
            }
            System.out.println("Process stop");
        }
    }
