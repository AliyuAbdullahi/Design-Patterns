package CreationalPatterns.SingletonPattern;

import java.util.List;

/**
 * Created by aliyuabdullahi on 12/25/16.
 */
public interface IRepository<T>  {
    void create(T data);
    T read();
    T read(int position);
    void update(int position, T data);
    void delete(int position);
    void deleteAll();
    boolean contains(T data);
    List<T> getAll();
}
