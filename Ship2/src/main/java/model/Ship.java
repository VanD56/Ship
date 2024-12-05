package model;

public class Ship {
    int num; // число палуб
    int decNum; // число подбитых палуб
    //координаты крайне левой палубы
    int x;
    int y;
    int horizont; // 1 горизонтально, 0 вертикально
    int type;  // 0 если палуба не подбита иначе -2

    public Ship(int nam, int horizont, int y, int x) {
        this.num = nam;
        this.horizont = horizont;
        this.y = y;
        this.x = x;
        decNum = num;
        type=num;
    }

    public Ship() {
    }
    public Ship(Ship s) {
        this.num = s.num;
        this.x = s.x;
        this.horizont = s.horizont;
        this.y = s.y;
        this.decNum = s.decNum;
        this.type = s.type;
    }
    public void Wound(int x,int y){
        decNum--;
    }
    public boolean isWounded() {
        return type == -2;
    }

    public boolean isKilShip() {
        return type == -3;
    }

    public boolean isShip() {
        return num > 0;
    }

    public boolean isShip0() {
        return num == 0;
    }
    public boolean kil() {
        return decNum == 0;
    }
    // Метод для сравнения с другим кораблем (неравенство)
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Ship)) return false;
        Ship s = (Ship) obj;
     if(this.num == s.num &&
             this.x == s.x &&
             this.horizont == s.horizont &&
             this.y == s.y &&
             this.decNum == s.decNum)
    return true;
     else
         return false;

    }

    // Метод для неравенства
    public boolean notEquals(Ship s) {
        return this.num != s.num ||
                this.x != s.x ||
                this.horizont != s.horizont ||
                this.y != s.y ||
                this.decNum != s.decNum;
    }
}

