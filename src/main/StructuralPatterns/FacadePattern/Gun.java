package main.StructuralPatterns.FacadePattern;

/**
 * Created by aliyuabdullahi on 12/25/16.
 */
public interface Gun {
    int numberOfBullets();
    void loadBullets();
    void addBullet(int numberOfBullets);
    void unJam();
    void shoot();
    void clean();
    void cock();
    void aim();
    void drop();
    void removeBullet(int numberOfBullets);
    void emptyBullets();
    boolean isJammed();
    void setJammed(boolean jam);
    double bulletImpact();
}
