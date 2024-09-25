class Rectangle {
    int width;
    int length;

    Rectangle(int w, int l) {
        this.width = w;
        this.length = l;
    }

    int area() {
        return this.width * this.length;
    }

    int perimeter() {
        return (this.width + this.length) * 2;
    }

    boolean isValid() {
        return this.width > 0 && this.length > 0;
    }
}

class Square {
    int width;

    Square(int w) {
        this.width = w;
    }

    int area() {
        return this.width * this.width;
    }

    int perimeter() {
        return this.width * 4;
    }

    boolean isValid() {
        return this.width > 0;
    }

    boolean isBiggerThan(Rectangle toto) {
        return this.area() > toto.area();
    }
}
