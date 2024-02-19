package structural_design_patterns.composite_pattern;
/**
 * The composite pattern is applicable in scenarios where objects within a hierarchy share common behaviors and can be treated uniformly. 
 * For instance, in a drawing tool, shapes like rectangles and circles can be created and manipulated in terms of size and other functionalities. 
 * Furthermore, groups of shapes can be formed, enabling the application of these functionalities collectively. 
 * Similarly, in a file system, deleting a folder necessitates the deletion of all its files. In both cases, 
 * the composite pattern allows for the uniform treatment of individual objects and groups, simplifying the implementation of operations across the hierarchy.
 */
public class Main {
    public static void main(String[] args) {
        Group group1 =new Group();
        group1.add(new Shape());
        group1.add(new Shape());

        Group group2=new Group();
        group2.add(new Shape());
        group2.add(new Shape());

        Group group3=new Group();
        group3.add(group1);
        group3.add(group2);
        group3.render();
        group3.move();
    }
}
