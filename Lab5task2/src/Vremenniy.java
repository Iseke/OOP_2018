public class Vremenniy {
    /*System.out.println("<<<<<<<<<<<<adding course>>>>>>>>>");
        ObjectOutputStream oisc = new ObjectOutputStream(new FileOutputStream("vec_course.ser.out"));

        System.out.println("Please fill next fields: courseName , Instructor ,Textbook");
        nameCourse = scan.next();
        System.out.println("If you want to add new Instructor press '1' or press '2' to choose from existing");
        choiceneworold =scan.nextInt();
        switch (choiceneworold){
            case 1:
                ObjectOutputStream oosi1 = new ObjectOutputStream(new FileOutputStream("vec_instructor.ser.out"));
                System.out.println("Please fill next fields: ");
                System.out.print("Write name: ");
                name = scan.next();
                System.out.println();
                System.out.print("Write surname: ");
                surname =scan.next();
                System.out.println();
                System.out.print("Write department: ");
                department = scan.next();
                System.out.println();
                System.out.print("Write email:");
                email = scan.next();
                instructor = new Instructor(name,surname,department,email);
                vec_instructor.add(instructor);
                oosi1.writeObject(vec_instructor);
            case 2:
                ObjectInputStream oisi2 = new ObjectInputStream(new FileInputStream("vec_instructor.ser.out"));
                Vector<Instructor> inst = (Vector<Instructor>)oisi2.readObject();
                Iterator it = inst.iterator();
                System.out.println("Choose the instructor: ");
                for(int i = 0; i < inst.size(); i++) {
                    System.out.println(i+1 + ") " + inst.get(i).toString());
                }
                instrucot_choose = scan.nextInt();
                instructor = new Instructor(inst.get(instrucot_choose-1).getName(),inst.get(instrucot_choose-1).getSurname(),inst.get(instrucot_choose-1).getDepartment(),inst.get(instrucot_choose-1).getEmail());
                oisi2.close();


        }
        System.out.println("Ff you want to add new textbook press '1' else press '2' to choice from existing textbooks");
        choiceneworold = scan.nextInt();
        switch (choiceneworold){
            case 1:
                ObjectOutputStream oost1 = new ObjectOutputStream(new FileOutputStream("vec_book.ser.out"));
                System.out.println("Please fill next fields: ");
                System.out.print("Write tittle: ");
                tittle = scan.next();
                System.out.println();
                System.out.print("Write author: ");
                author = scan.next();
                System.out.println();
                System.out.print("Write isbn: ");
                isbn = scan.nextInt();
                book = new Textbook(isbn,tittle,author);
                vec_book.add(book);
                oost1.writeObject(vec_book);
                oost1.close();
            case 2:
                ObjectInputStream oist = new ObjectInputStream(new FileInputStream("vec_book.ser.out"));
                Vector<Textbook> inst = (Vector<Textbook>)oist.readObject();
                Iterator it = inst.iterator();
                System.out.println("Choose the Textbook: ");
                for(int i = 0; i < inst.size(); i++) {
                    System.out.println(i+1 + ") " + inst.get(i).toString());
                }
                choosen_book = scan.nextInt();
                book = new Textbook(inst.get(choosen_book-1).getIsbn(),inst.get(choosen_book-1).getTittle(),inst.get(choosen_book-1).getAuthor());
                oist.close();

                continue isAdmin;


        }
        System.out.println("Course added");
        course = new Course(nameCourse,book,instructor);
        vec_course.add(course);
        oisc.writeObject(vec_course);
*/
}
