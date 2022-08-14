/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class NestedIterator implements Iterator<Integer> {
    Queue<Integer> q;
    public NestedIterator(List<NestedInteger> nestedList) {
            q = new LinkedList<>();
            NestedIterator(nestedList, q);
    }
    public void NestedIterator(List<NestedInteger> nestedList, Queue<Integer> q){
        for(int i = 0;i<nestedList.size();i++){
            NestedInteger n = nestedList.get(i);
            if(n.isInteger()){
                q.add(n.getInteger());
            }
            else{
                NestedIterator(n.getList(), q);
            }
        }
    }

    @Override
    public Integer next() {
        return q.poll();
    }

    @Override
    public boolean hasNext() {
        return !q.isEmpty();
    }
}
/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */