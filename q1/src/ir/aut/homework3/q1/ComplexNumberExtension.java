package ir.aut.homework3.q1;

import java.util.ArrayList;
import java.util.Iterator;

public class ComplexNumberExtension {
    private int element = 100;
    private ArrayList<ComplexNumberExtension> complexList = new ArrayList<>();
    private ComplexNumberExtension complexArray[] = new ComplexNumberExtension[element];
    private int complexCounter = 0;
    private double real;
    private double image;

    /**
     * this constructor makes complex number.
     *
     * @param real  is the real part of complex number
     * @param image is the imaginary part of complex number
     */
    public ComplexNumberExtension(double real, double image) {
        this.real = real;
        this.image = image;
    }

    /**
     * this constructor produce a default complex number when no argument is given
     */
    public ComplexNumberExtension() {
        this(0, 0);
    }

    /**
     * this method add given complex number to array
     *
     * @param complexNumber is the number that is going to be added to array
     */
    public void addToArray(ComplexNumberExtension complexNumber) {
        complexArray[complexCounter] = complexNumber;
        complexCounter++;
    }

    /**
     * this method gives an index and remove its object(number) from array
     *
     * @param index is place of the deleting number
     */
    public void removeByArrayIndex(int index) {
        for (int i = 0; i < complexCounter; i++) {
            if ((i == index - 1)) {
                System.arraycopy(complexArray, i + 1, complexArray, i, complexCounter - i);
            }
        }
        complexCounter--;
    }

    /**
     * this method gives a number and remove it from array
     *
     * @param complexNumber is the removal object
     */
    public void removeByArrayObject(ComplexNumberExtension complexNumber) {
        //int removingIndex = -1;
        int i;
        for (i = 0; i < complexCounter; i++) {
            if (toString(complexArray[i]).equals(toString(complexNumber))) {
                //removingIndex = i;
                break;
            }
        }
        removeByArrayIndex(i + 1);
    }

    /**
     * this method add given number to array list
     *
     * @param complexNumber is the number that is going to be added to array list
     */
    public void addToList(ComplexNumberExtension complexNumber) {
        this.complexList.add(complexNumber);
    }

    /**
     * this method removes the given number from array list
     *
     * @param complexNumber is the removal number
     */
    public void removeByListObject(ComplexNumberExtension complexNumber) {
        this.complexList.remove(complexNumber);
    }

    /**
     * this method removes the number in the given index
     *
     * @param index is place of removal object
     */
    public void removeByListIndex(int index) {
        this.complexList.remove(index - 1);
    }

    /**
     * this method prints array with for-loop
     */
    public void showArrayWithLoop() {
        for (int i = 0; i < complexCounter; i++) {
            System.out.println("(" + ++i + ") " + toString(complexArray[--i]));
        }
    }

    /**
     * this method prints array with for-each
     */
    public void showArrayWithEach() {
        int[] tempArrForCounter = makeCounterArray();
        for (int i : tempArrForCounter) {
            System.out.println("(" + i + ") " + toString(complexArray[--i]));
        }
    }

    /**
     * this method makes an array including 1 to complex number counter
     *
     * @return the array including 1 to counter
     */
    private int[] makeCounterArray() {
        int tempArrForCounter[] = new int[complexCounter];
        int tempCounter = complexCounter;
        for (int i = complexCounter - 1; i >= 0; i--) {
            tempArrForCounter[i] = tempCounter;
            tempCounter--;
        }
        return tempArrForCounter;
    }

    /**
     * this method prints array list with iterator
     */
    public void showListWithIterator() {
        Iterator<ComplexNumberExtension> iterator = complexList.iterator();
        int i = 1;
        while (iterator.hasNext()) {
            System.out.println("(" + i + ") " + toString(iterator.next()));
            i++;
        }
    }

    /**
     * this method prints array list with for-loop
     */
    public void showListWithLoop() {
        for (int i = 0; i < complexCounter + 2; i++) {
            System.out.println("(" + ++i + ") " + toString(complexList.get(--i)));
        }
    }

    /**
     * this method prints array list with for-each
     */
    public void showListWithEach() {
        complexCounter += 2;
        int[] tempArrForCounter = makeCounterArray();
        for (int i : tempArrForCounter) {
            System.out.println("(" + i + ") " + toString(complexList.get(--i)));
        }
        complexCounter -= 2;
    }

    /**
     * this method searches a number in array and gives back its index
     *
     * @param complexNumber is the number that we want to search
     * @return the number's index if it exists; else -1
     */
    public int searchInArray(ComplexNumberExtension complexNumber) {
        int returnedIndex = -1;
        for (int i = 0; i < complexCounter; i++) {
            if (toString(complexArray[i]).equals(toString(complexNumber))) {
                returnedIndex = ++i;
                break;
            }
        }
        return returnedIndex;
    }

    /**
     * this method searches a number in array list and gives back its index
     *
     * @param complexNumber is the number that we want to search
     * @return the number's index if it exists; else -1
     */
    public int searchInList(ComplexNumberExtension complexNumber) {
        Iterator<ComplexNumberExtension> iterator = complexList.iterator();
        int index = -1;
        while (iterator.hasNext()) {
            if (toString(iterator.next()).equals(toString(complexNumber))) {
                index = complexList.indexOf(complexNumber);
                return index + 1;
            }
        }
        return index;
    }

    /**
     * this method converts the number to string
     *
     * @param complexNumber is the number that we want to convert to string
     * @return the converted string
     */
    public String toString(ComplexNumberExtension complexNumber) {
        if (complexNumber.image >= 0)
            return complexNumber.real + " + " + complexNumber.image + "i";
        else
            return complexNumber.real + " " + complexNumber.image + "i";
    }

    public ArrayList<ComplexNumberExtension> getComplexList() {
        return complexList;
    }

    public void setComplexList(ArrayList<ComplexNumberExtension> complexList) {
        this.complexList = complexList;
    }

    public ComplexNumberExtension[] getComplexArray() {
        return complexArray;
    }

    public void setComplexArray(ComplexNumberExtension[] complexArray) {
        this.complexArray = complexArray;
    }
}