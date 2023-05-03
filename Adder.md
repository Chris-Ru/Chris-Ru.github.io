<title>Adder CSUSM CS231</title>
<h1>Binary Adder with Microcontroller</h1>

Preparation before setup
<details>
<summary>Hardware Requirements</summary>

```java
    - full-size breadboard
    - 5 LEDs(color of your choice)
    - 8 buttons
    - Microcontroller(this project uses an ESP-32S NodeMCU)
    - A computer with VSCode with PlatformIO extension to push C++ code to ESP or Arduino
        - Can also use Arduino IDE
```

</details>

Wiring Adder before code
<details>
    <summary>Wiring Circuit</summary>

</details>

Writing C++ code for microcontroller
<details>
    <summary>Software for Microcontroller</summary>
    
</details>



```java
public class Sorting {
    private final ArrayList<Integer> data = new ArrayList<>();
    private final Duration timeElapsed;

    public Sorting(int size, String method) {
        Instant start = Instant.now();  // time capture -- start
        // build an array
        for (int i = 0; i < size; i++) {
            data.add((int)(Math.random() * (size+1)));
        }
        // use Inheritance and Polymorphism to replace data.sort with your own algorithm
        //BubbleSort.sort(data);

        switch(method) {
            case "Selection Sort":
                Selections.sort(data);
                System.out.println();
                break;
            case "Bubble Sort":
                BubbleSorts.sort(data);
                System.out.println();
                break;
            case "Insertion Sort":
                Insertions.sort(data);
                break;
            case "Merge Sort":
                MergeSorts.sort(data);
                break;
            default:
                System.out.println("This is an invalid Sort Selection");
        }

        Instant end = Instant.now();    // time capture -- end
        this.timeElapsed = Duration.between(start, end);

    }
    public ArrayList<Integer> getData() {
        return data;
    }

    public int getTimeElapsed() {
        return timeElapsed.getNano();
    }
}
```