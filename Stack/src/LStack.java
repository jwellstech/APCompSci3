public class LStack<T> implements IStack<T>
{
    private Link<T> top;
    public LStack()
    {
        top = null;
    }
    /**
     * This evaluates to true if the stack is empty
     * @return true if the stack is empty and false otherwise
     */
    public boolean isEmpty()
    {
        return top == null;
    }
    /**
     * This places newItem onto the top of the stack
     * @param newItem the item to be placed on the stack
     */
    public void push(T newItem)
    {
        top = new Link<T>(newItem);
    }
    /**
     * This accessor returns a reference to the item atop the stack
     * @return the item on the top of teh stack
     * @throws EmptyStackException if the stack is empty
     */
    public T peek()
    {
        return null;
    }
    /**
     * This mutator removes the top item from the stack and returns it.
     * @return the item onthe top of the stack
     * @throws EmptyStackException if the stack is empty.
     */
    public T pop()
    {
        return null;
    }
    /**
     * This returns the number of items on  this stack.
     * @return the number of items on this stack
     */
    public int size()
    {
        return 0;
    }
    @Override
    public String toString()
    {
        Link<T> nav = top;
        StringBuffer sb = new StringBuffer();
        while(nav != null)
        {
            //print datum
            //go to next link.

        }
        return sb.toString();

    }
}
class Link<T>
{
    private T datum;
    private Link<T> next;
    public Link(T datum, Link<T> next)
    {
        this.datum = datum;
        this.next = next;
    }
    public Link(T datum)
    {
        this(datum, null);
    }
}