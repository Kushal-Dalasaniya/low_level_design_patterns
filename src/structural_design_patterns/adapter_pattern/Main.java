package structural_design_patterns.adapter_pattern;

import structural_design_patterns.adapter_pattern.avaFilters.Caramel;

/**
 * The adapter pattern is employed in this scenario to facilitate the integration of a third-party filter,
 * such as the Caramel Filter, with the existing ImageView class, which expects an Image object in its constructor
 * and provides functionality to apply various filters.<br><br>
 * 
 * Initially, the ImageView class interacts with filters through the Filter interface. However, when a third-party
 * filter like the Caramel Filter lacks implementation of our Filter interface, an adapter is necessary to bridge
 * the gap between the two interfaces.<br><br>
 * 
 * This adapter serves as an intermediary, conforming to the Filter interface expected by the ImageView class while
 * internally delegating filtering operations to the third-party Caramel Filter. As a result, the ImageView class
 * can seamlessly utilize the Caramel Filter, treating it as if it were a native Filter interface object.<br><br>
 * 
 * The adapter pattern enables the ImageView class to maintain compatibility with both its existing filter implementations
 * and new third-party filters, fostering flexibility and extensibility within the application.<br><br>
 */
public class Main {
    public static void main(String[] args) {
        ImageView imageView = new ImageView(new Image());
        imageView.apply(new VividFilter());
        imageView.apply(new CaramelFilter(new Caramel()));
    }
}
