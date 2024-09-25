class Rectangle {
    int width;
    int length;

    Rectangle(int w, int l) {
        width = w;
        length = l;
    }

    int area() {
        return width * length;
    }

    int perimeter() {
        return (width + length) * 2;
    }

    boolean isValid() {
        return width > 0 && length > 0;
    }
}

class Square {
    int width;

    Square(int w) {
        width = w;
    }

    int area() {
        return width * width;
    }

    int perimeter() {
        return width * 4;
    }

    boolean isValid() {
        return width > 0;
    }

    boolean isBiggerThan(Rectangle r) {
        return this.area() > r.area();
    }
}
