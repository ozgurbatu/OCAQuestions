package Day25;

import java.util.ArrayList;
import java.util.List;

public class Q01 {
    public static void main(String[] args) {

        List<String> arrayList=new ArrayList<>();
        arrayList.add("Tech");
        arrayList.add("Expert");
        arrayList.set(0,"Java"); // Java Expert
        arrayList.forEach(a-> a.concat("Forum")); // JavaForum ExpertForum
        arrayList.replaceAll(s-> s.concat("Group"));// JavaGroup ExpertGroup
        System.out.println(arrayList);


    }
}
/**
What is the result?
A. [JavaForum, ExpertForum]
B. [JavaGroup, ExpertGroup]
C. [JavaForumGroup, ExpertForumGroup]
D. [JavaGroup, TechGroup ExpertGroup]
Answer: B
*/
