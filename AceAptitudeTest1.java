import java.util.Scanner;

public class AceAptitudeTest {
    public static float Relationships(){
        Scanner reading = new Scanner(System.in);
        String choice = null;
        String choice1 = null;
        String choice2 = null;
        //int num1 = 0;
        //int num2 = 0;
        float total = 0;


        System.out.println("\nIn regards to sexual arousal and emotional bond, how do you prioritize your relationships?\n" +
                "a. More emotional bond than sexual arousal\n" +
                "b. Equal levels of emotional bond and sexual arousal\n" +
                "c. More sexual arousal than emotional bond\n"+
                "d. None of the above or N/A\n");
        choice1 = reading.next();
        switch(choice1){
            case "a":
                total+=2;
                break;
            case "b":
                total+=0.5;
                break;
            case "c":
            case "d":
                total+=1;
                break;
        }
        System.out.println("\nFrom the choices below, which unique relationship factor do you believe differentiates a friend from a significant other?\n" +
                "a. Sexual contact\n" +
                "b. Strong emotional bond\n" +
                "c. Other\n" +
                "d. None of the above");
        choice2 = reading.next();
        switch(choice2){
            case "a":
            case "c":
                total+=1;
                break;
            case "b":
                if(choice1 =="a" || choice1 == "b") {
                    total += 1;
                }else{
                    total+=2;
                }
                break;
            case "d":
                total+=3;
                break;

        }

        System.out.println("Eros: Love focusing on beauty, passion, and sensual behavior\n" +
                "Mania: Love based on a need for affection that demands continuous satisfaction\n"+
                "Ludus: Casual and carefree love; 'nothing serious'\n"+
                "Storge: Love that develops and fades gradually, ie. transition from friend to significant other\n" +
                "Agape: Universal/Brotherly love; no specific target(s) of love\n"+
                "Pragma: Love focused on practicality, choosing partners with ideal/desirable qualities\n");
        System.out.println("Of the six basic styles of love, defined above, which style best describes the nature of your relationships? (Type answer)");
        choice = reading.next();
        for(int i=0;i<choice.length();i++){
            Character.toLowerCase(choice.charAt(i));
        }
        boolean check2 = total <4;
        switch(choice){
            //boolean check1 = total >= 1.5;
            case "pragma":
                if(check2){
                    total+=4;
                } else {
                    total += 6;
                }

                break;
            case "storge":
                total+=4;
                break;
            case "agape":
                total+=3;
                break;
            case "mania":
            case "ludus":
                total+=2;
                break;
        }
        //System.out.println("\nRelationship score is " + total+ "\n");
        return total;
    }
    public static float Sexuality(){
        Scanner reading = new Scanner(System.in);
        String choice = null;
        int num1;
        int num2;
        int hold = 0;
        //boolean check1 = num1 <= 2 || num2 <= 2;
        //boolean check2 = num1 > 2 || num2 > 2;
        float total = 0;
        System.out.println("\nWhich condition best describes the origin of your current sexuality?\n" +
                "a. Natural attraction, or lack of, to specific gender(s)\n" +
                "b. Conclusion made after self-questioning and/or experimenting\n" +
                "c. Self-identification with a certain sexuality once discovering its existence\n"+
                "d. Other");
        choice = reading.next();
        switch(choice){
            case "b":
                total+=3;
                break;
            case "a":
                total+=2;
                break;
            case "d":
                total+=1;
                break;
            case "c":
                total+=4;
                break;
        }

        System.out.println("\nOn a scale of 1-5, 1 for Very Low/Nonexistent and 5 for Very High, rate your level of heteroeroticism --ie. your ability to be sexually aroused by gender(s) other than your own.\n");
        num1 = reading.nextInt();
        switch(num1){
            case 1:
                hold = 4;
                break;
            case 2:
                hold = 3;
                break;
            case 3:
                hold = 2;
                break;
            case 4:
                hold = 1;
                break;
            case 5:
                hold = 0;
                break;
        }

        System.out.println("\nOn a scale of 1-5, 1 for Very Low/Nonexistent and 5 for Very High, rate your level of homoeroticism --ie. your ability to be sexually aroused by individuals of the same gender.");
        num2 = reading.nextInt();
        switch(num2){
            case 1:
                if(num1 > 3){
                    switch(num1){
                        case 4:
                            total+=(1);
                            break;
                        case 5:
                            total+=(0);
                            break;
                    }
                }
                if(num1 == 3){
                    total+= (6);
                }
                if (num1 < 3){
                    switch(num1){
                        case 1:
                            total+=8;//(hold +4);
                            break;
                        case 2:
                            total+=(7);
                            break;
                    }
                }
                break;
            case 2:
                if(num1 > 3){
                    switch(num1){
                        case 4:
                            total+=(2);
                            break;
                        case 5:
                            total+=(1);
                            break;
                    }
                }
                if(num1 == 3){
                    total+= (5);
                }
                if (num1 < 3){
                    switch(num1){
                        case 1:
                            total+=(7);
                            break;
                        case 2:
                            total+=(6);
                            break;
                    }
                }
                break;
            case 3:
                if(num1 ==3){
                    total+=4;//(2);
                }
                if(num1 > 3){
                    switch(num1){
                        case 4:
                            total+=3;
                            break;
                        case 5:
                            total+=1.5;
                            break;
                    }
                }
                if(num1 < 3){
                    switch(num1){
                        case 1:
                            total+=6;
                            break;
                        case 2:
                            total+=5;
                            break;
                    }
                }
                break;
            case 4:
                if(num1 > 3){
                    switch(num1){
                        case 4:
                            total+=(1.5);
                            break;
                        case 5:
                            total+=(1);
                            break;
                    }
                }
                if(num1 == 3){
                    total+= (3);
                }
                if (num1 < 3){
                    switch(num1){
                        case 1:
                            total+=(1);
                            break;
                        case 2:
                            total+=(2);
                            break;
                    }
                }
                break;
            case 5:
                if(num1 > 3){
                    switch(num1){
                        case 4:
                            total+=(1);
                            break;
                        case 5:
                            total+=0;//(0);
                            break;
                    }
                }
                if(num1 == 3){
                    total+= (1.5);
                }
                if (num1 < 3){
                    switch(num1){
                        case 1:
                            total+=0;//(hold +0);
                            break;
                        case 2:
                            total+=(1);
                            break;
                    }
                }
                break;
        }
        //System.out.println("Sexuality score is " + total +"\n");

        return total;
    }
    public static float Sex(){
        Scanner reading = new Scanner(System.in);
        float total = 0;
        String choice = null;
        int num = 0;
        System.out.println("\nOn a scale of 1-5, 1 for Very Low/Nonexistent and 5 for Very High, rate your sex drive.\n");
        num = reading.nextInt();
        switch(num){
            case 1:
                total+=5;
                break;
            case 2:
                total+=4;
                break;
            case 3:
                total+=2;
                break;
            case 4:
                total+=1.5;
                break;
            case 5:
                total+=1;
                break;
        }
        System.out.println("\nIs an emotional bond important to you for beginning a sexual encounter?\n" +
                "a. Yes\n" +
                "b. No\n");
        choice = reading.next();
        if(choice.equals("a")){

            total+=1;

        }

        System.out.println("\nHow often do you initiate sex with your partner(s)?\n" +
                "a. Never/ Not Applicable\n" +
                "b. < 25% of the time \n" +
                "c. 25 - 50% of the time \n" +
                "d. 50 - 75% of the time \n" +
                "e. 75 - 100% of the time\n");
        choice = reading.next();
        switch(choice){
            case "a":
                total +=3;
                break;
            case "b":
                total +=2.5;
                break;
            case "c":
                total += 1;
                break;
            case "d":
                total+= 0.5;
                break;

        }
        System.out.println("\nReferencing your previous relationships, how often are you 'satisfied' with sexual intercourse?\n" +
                "a. Never/ Not Applicable\n" +
                "b. < 25% of the time \n" +
                "c. 25 - 50% of the time \n" +
                "d. 50 - 75% of the time \n" +
                "e. 75 - 100% of the time\n");
        choice = reading.next();
        switch(choice){
            case "a":
                total +=4;
                break;
            case "b":
                total +=3.5;
                break;
            case "c":
                total+=3;
                break;
            case "d":
            case "e":
                total+= 1;
                break;

        }
        //System.out.println("Sex score is " + total +"\n");

        return (total);
    }


    public static void main(String[] args){
        Scanner reading = new Scanner(System.in);
        int choice;
        float aliTy = 0;
        float reLat = 0;
        float sex = 0;
        int count = 0;
        String menu = "\nPlease select a category\n\n1.Sexuality\n2.Relationships\n3.Sex\n\n";
        System.out.println("WELCOME TO THE ACE APTITUDE TEST!");
        System.out.println("---------------------------------\n");

        while (count < 3) {
            System.out.print(menu);
            choice = reading.nextInt();
            switch (choice) {
                case 1:
                    if (aliTy < 1) {
                        aliTy = Sexuality();
                        menu = menu.replace("\n1.Sexuality", "\n1.Sexuality[ANSWERED]");
                        count ++;
                        System.out.println("Sexuality score is " + aliTy);
                    }
                    else{
                        System.out.println("Category already answered\n");
                    }
                    break;
                case 2:
                    if(reLat < 1) {
                        reLat = Relationships();
                        menu = menu.replace("\n2.Relationships", "\n2.Relationships[ANSWERED]");
                        count ++;
                        System.out.println("Relationship score is " + reLat);
                    }
                    else{
                        System.out.println("Category already answered\n");
                    }
                    break;
                case 3:
                    if(sex < 1) {
                        sex = Sex();
                        menu = menu.replace("\n.Sex", "\n2.Sex[ANSWERED]");
                        count ++;
                        System.out.println("Sex score is " + sex);
                    }
                    else{
                        System.out.println("Category already answered");
                    }
                    break;

            }
        }
        System.out.println("\nCompare your scores below, to the range of scores typical for a romantic asexual\n");
        System.out.println("Romantic Asexuals\t\t\t"+"       YOU          ");
        System.out.println("------------------\t\t\t"+"------------------");
        System.out.println("Sexuality:     5-12\t\t\t"+"Sexuality:     "+aliTy);
        System.out.println("Relationships: 8-12\t\t\t"+"Relationships: "+reLat);
        System.out.println("Sex:           6-13\t\t\t"+"Sex:           "+sex);

    }






}
