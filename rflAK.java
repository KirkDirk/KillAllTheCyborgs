/**
 * Вид "АК" подкласса "Винтовки"
 */
public class RflAK extends WpnRifle {

    @Override
    public int wpnDamage() {
        return 100;
    }
    @Override
    public int wpnSizeMagazine() {
        return 30;
    }
    @Override
    public int wpnRange() {
        return 50;
    }
    @Override
    public String toString() {
        return "Винтовка АК " + super.toString();
    }
}
