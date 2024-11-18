package day3;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonExample {

    public static void main(String[] args) {
        try {
            JSONObject employeeDetails = new JSONObject();
            employeeDetails.put("id", 1);
            employeeDetails.put("name", "Jack");
            employeeDetails.put("age", 30);
            employeeDetails.put("department", "Engineering");

            System.out.println("Employee Details (JSONObject): " + employeeDetails);

            int id = employeeDetails.getInt("id");
            String name = employeeDetails.getString("name");
            System.out.println("Employee ID: " + id);
            System.out.println("Employee Name: " + name);

            JSONArray employeesArray = new JSONArray();
            employeesArray.put(employeeDetails);  
            JSONObject anotherEmployee = new JSONObject();
            anotherEmployee.put("id", 2);
            anotherEmployee.put("name", "Jill");
            anotherEmployee.put("age", 25);
            anotherEmployee.put("department", "Marketing");

            employeesArray.put(anotherEmployee);

            System.out.println("Employees Array (JSONArray): " + employeesArray);

            for (int i = 0; i < employeesArray.length(); i++) {
                JSONObject employee = employeesArray.getJSONObject(i);
                System.out.println("Employee " + (i + 1) + ":");
                System.out.println("ID: " + employee.getInt("id"));
                System.out.println("Name: " + employee.getString("name"));
                System.out.println("Age: " + employee.getInt("age"));
                System.out.println("Department: " + employee.getString("department"));
                System.out.println("----------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
