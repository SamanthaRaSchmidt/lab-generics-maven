package edu.grinnell.csc207.util.predicates;

import edu.grinnell.csc207.util.Predicate;

/**
 * Predicates for small strings.  Uses a form of the Singleton pattern.
 * Clients cannot create SmallString objects; they must reference
 * SmallString.PRED.
 *
 * @author Samuel A. Rebelsky
 *
 */
public class SmallObjects implements Predicate<Object> {
  // +-----------+---------------------------------------------------
  // | Constants |
  // +-----------+

  /**
   * One copy of this predicate, following the singleton pattern.
   */
  public static final SmallObjects PRED = new SmallObjects();

  // +--------------+------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Create a new predicate. Made private to prevent clients from
   * creating new objects (part of the singleton pattern).
   */
  private SmallObjects() {
  } // SmallObjects()

  // +---------+-----------------------------------------------------
  // | Methods |
  // +---------+

  /**
   * Determine if val is a small string.
   *
   * @param val
   *   The string we evaluate.
   *
   * @return
   *   true if val is small and false otherwise.
   */
  public boolean holds(Object val) {
    String value = new String();
    value = String.valueOf(val);
    return value.length() < 5;
  } // holds(String)
} // class SmallString