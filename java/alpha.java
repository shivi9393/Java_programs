class alpha {
    public static void main(String[] args) {
        int num = 4;

        if (num >= 1 && num <= 10) {
            if (num == 1) {
                System.out.println("One");
            } else if (num == 2) {
                System.out.println("Two");
            } else if (num == 3) {
                System.out.println("Three");
            } else if (num == 4) {
                System.out.println("Four");
            } else if (num == 5) {
                System.out.println("Five");
            } else if (num == 6) {
                System.out.println("Six");
            } else if (num == 7) {
                System.out.println("Seven");
            } else if (num == 8) {
                System.out.println("Eight");
            } else if (num == 9) {
                System.out.println("Nine");
            } else if (num == 10) {
                System.out.println("Ten");
            }
        }
        else if (num >= 11 && num < 20) {
            int last_digit = num % 10;
            if (last_digit == 1) {
                System.out.println("Eleven");
            } else if (last_digit == 2) {
                System.out.println("Twelve");
            } else if (last_digit == 3) {
                System.out.println("Thirteen");
            } else if (last_digit == 4) {
                System.out.println("Fourteen");
            } else if (last_digit == 5) {
                System.out.println("Fifteen");
            } else if (last_digit == 6) {
                System.out.println("Sixteen");
            } else if (last_digit == 7) {
                System.out.println("Seventeen");
            } else if (last_digit == 8) {
                System.out.println("Eighteen");
            } else if (last_digit == 9) {
                System.out.println("Nineteen");
            }
        }
        else if (num >= 20 && num < 100) {
            int tens = num / 10;
            int ones = num % 10;

            if (tens == 2) {
                System.out.print("Twenty");
            } else if (tens == 3) {
                System.out.print("Thirty");
            } else if (tens == 4) {
                System.out.print("Forty");
            } else if (tens == 5) {
                System.out.print("Fifty");
            } else if (tens == 6) {
                System.out.print("Sixty");
            } else if (tens == 7) {
                System.out.print("Seventy");
            } else if (tens == 8) {
                System.out.print("Eighty");
            } else if (tens == 9) {
                System.out.print("Ninety");
            }

            if (ones != 0) {
                if (ones == 1) {
                    System.out.println(" One");
                } else if (ones == 2) {
                    System.out.println(" Two");
                } else if (ones == 3) {
                    System.out.println(" Three");
                } else if (ones == 4) {
                    System.out.println(" Four");
                } else if (ones == 5) {
                    System.out.println(" Five");
                } else if (ones == 6) {
                    System.out.println(" Six");
                } else if (ones == 7) {
                    System.out.println(" Seven");
                } else if (ones == 8) {
                    System.out.println(" Eight");
                } else if (ones == 9) {
                    System.out.println(" Nine");
                }
            }
        } 
        
    



        // if(num==1){
        //     System.out.println("one");
        // }
        // else{
        //     System.out.println("Not Equal To one");
        // }
        // int ss=1;
        // int a;
        // a=(num==ss) ? 99: 88;
        
        // System.out.println(a);


    } 
}