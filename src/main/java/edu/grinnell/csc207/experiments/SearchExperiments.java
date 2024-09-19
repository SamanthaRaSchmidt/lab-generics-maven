package edu.grinnell.csc207.experiments;

import edu.grinnell.csc207.util.SearchUtils;
import edu.grinnell.csc207.util.predicates.OddInteger;
import edu.grinnell.csc207.util.predicates.SmallObjects;
import edu.grinnell.csc207.util.predicates.SmallString;

import java.io.PrintWriter;

/**
 * A simple set of experiments with predicates and searching.
 *
 * @author Samuel A. Rebelsky
 * @author Koast & Sam
 */
public class SearchExperiments {
    /**
     * Run the experiments.
     *
     * @param args
     *             Command-line arguments (ignored).
     */
    public static void main(String[] args) {
        // Prepare for output.
        PrintWriter pen = new PrintWriter(System.out, true);

        // Set up a few arrays to search.
        String[] strings = new String[] { "alpha", "bravo", "charlie", "delta", "echo", "foxtrot",
                "golf", "hotel", "india", "juliett", "kilo", "lima", "mike",
                "november", "oscar" };
        Integer[] numbers = new Integer[] { 2, 3, 5, 7, 9, 11, 13, 15, 17, 18, 32, 42 };
        Object[] objects = new Object[] {"alpha", "bravo", "charlie", "delta", "echo", "foxtrot",
                "golf", "hotel", "india", "juliett", "kilo", "lima", "mike",
                "november", "oscar" };

        // Okay, we're ready for the experiments
        pen.println("A small string: "
                + SearchUtils.search(strings, SmallString.PRED));
        pen.println("An odd integer: "
                + SearchUtils.search(numbers, OddInteger.PRED));
        pen.println("A small object: "
                + SearchUtils.search(objects, SmallObjects.PRED));
        pen.println("A small string: " + SearchUtils.search(strings, SmallObjects.PRED));
        pen.println("A small string: " + SearchUtils.search(numbers, SmallObjects.PRED));
    } // main(String[])

} // class SearchExperiments
