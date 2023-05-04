import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class CountCharsInString_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        LinkedHashMap<Character, Integer> counts = new LinkedHashMap<>();
        for ( char num: sc.nextLine().replace(" ","").toCharArray()  ) {
            if(!counts.containsKey(num)){
                counts.put(num, 0);
            }
            counts.put(num, counts.get(num)+1);
        }
        for (Map.Entry<Character, Integer> entry: counts.entrySet()  ) {

            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}


    INSERT INTO students ( first_name,  last_name, age, grade  ) VALUES('Guy', 'Gilbert', 15, 4.5);
        INSERT INTO students ( first_name,  last_name, age, grade  ) VALUES('Kevin', 'Brown', 17, 5.4);
        INSERT INTO students ( first_name,  last_name, age, grade  ) VALUES('Roberto', 'Tamburello', 19, 6);
        INSERT INTO students ( first_name,  last_name, age, grade  ) VALUES('Linda', 'Smith', 18, 5);
        INSERT INTO students ( first_name,  last_name, age, grade  ) VALUES('John', 'Stones', 16, 4.25);
        INSERT INTO students (first_name,  last_name, age, grade  ) VALUES('Nicole', 'Nelson', 17, 5.50);

        CREATE TABLE students(id INT AUTO_INCREMENT, first_name VARCHAR(50) , last_name VARCHAR(50) , age int , grade DOUBLE,   PRIMARY KEY (id) );