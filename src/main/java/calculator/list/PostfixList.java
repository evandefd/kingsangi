package calculator.list;

import calculator.enums.Operator;

import java.util.Collection;
import java.util.LinkedList;

/**
 * <p>
 * The {@code PostfixList} class is the custom LinkedList class that can be added only {@code double} and {@code Operator} objects.
 * </p>
 */
public class PostfixList extends LinkedList<Object> {
    private static final long serialVersionUID = 5089839441432360300L;

    /**
     * Inserts the specified element at the beginning of this list.
     * <p>Note that you can add only {@code double} and {@code Operator} objects.</p>
     *
     * @param o the element to add
     */
    @Override
    public void addFirst(Object o) {
        checkTypeOrThrow(o);
        super.addFirst(o);
    }

    /**
     * Appends the specified element to the end of this list.
     * <p>Note that you can add only {@code double} and {@code Operator} objects.</p>
     *
     * <p>This method is equivalent to {@link #add}.
     *
     * @param o the element to add
     */
    @Override
    public void addLast(Object o) {
        checkTypeOrThrow(o);
        super.addLast(o);
    }

    /**
     * Appends all of the elements in the specified collection to the end of
     * this list, in the order that they are returned by the specified
     * collection's iterator.  The behavior of this operation is undefined if
     * the specified collection is modified while the operation is in
     * progress.  (Note that this will occur if the specified collection is
     * this list, and it's nonempty.)
     *
     * <p>Note that you can add only {@code double} and {@code Operator} objects.</p>
     *
     * @param c collection containing elements to be added to this list
     * @return {@code true} if this list changed as a result of the call
     * @throws NullPointerException if the specified collection is null
     */
    @Override
    public boolean addAll(Collection<?> c) {
        for (Object o : c) checkTypeOrThrow(o);
        return super.addAll(c);
    }

    /**
     * Inserts all of the elements in the specified collection into this
     * list, starting at the specified position.  Shifts the element
     * currently at that position (if any) and any subsequent elements to
     * the right (increases their indices).  The new elements will appear
     * in the list in the order that they are returned by the
     * specified collection's iterator.
     *
     * <p>Note that you can add only {@code double} and {@code Operator} objects.</p>
     *
     * @param index index at which to insert the first element
     *              from the specified collection
     * @param c     collection containing elements to be added to this list
     * @return {@code true} if this list changed as a result of the call
     * @throws IndexOutOfBoundsException {@inheritDoc}
     * @throws NullPointerException      if the specified collection is null
     */
    @Override
    public boolean addAll(int index, Collection<?> c) {
        for (Object o : c) checkTypeOrThrow(o);
        return super.addAll(index, c);
    }

    /**
     * Appends the specified element to the end of this list.
     *
     * <p>Note that you can add only {@code double} and {@code Operator} objects.</p>
     *
     * <p>This method is equivalent to {@link #addLast}.
     *
     * @param o element to be appended to this list
     * @return {@code true} (as specified by {@link Collection#add})
     */
    @Override
    public boolean add(Object o) {
        checkTypeOrThrow(o);
        return super.add(o);
    }

    /**
     * Inserts the specified element at the specified position in this list.
     * Shifts the element currently at that position (if any) and any
     * subsequent elements to the right (adds one to their indices).
     *
     * <p>Note that you can add only {@code double} and {@code Operator} objects.</p>
     *
     * @param index   index at which the specified element is to be inserted
     * @param element element to be inserted
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
    @Override
    public void add(int index, Object element) {
        checkTypeOrThrow(element);
        super.add(index, element);
    }

    private void checkTypeOrThrow(Object o) {
        if (!(o instanceof Number) && !(o instanceof Operator)) {
            throw new IllegalArgumentException("PostfixList only can add a Number or Operator object.");
        }
    }
}
