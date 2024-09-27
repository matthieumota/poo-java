package interfaces;

interface Living {
    /**
     * Un être vivant peut être nommé.
     */
    public String getName();

    /**
     * Un être vivant peut se déplacer.
     */
    public void move();

    /**
     * Un être vivant peut se déplacer avec quelqu'un.
     */
    public void move(Living other);

    /**
     * Un être vivant peut respirer.
     */
    public void breathe();
}
