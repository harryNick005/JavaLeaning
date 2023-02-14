package CustomeClass;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class employeeMethods {

    public static List<Integer> getId(List<employee> employeesList){
        List<Integer> employeeIdList=new ArrayList<>();
//       for( employee eachObject:employeesList){
//            employeeIdList.add(eachObject.getId());
//       }

        employeeIdList= employeesList.stream().map(employee::getId).collect(Collectors.toList());

        return employeeIdList;
    }
}
