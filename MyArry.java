public class MyArry
{
    int array[];  // place to store elements
    int length;   // store length of array
    int rightIndex;  // pointing at empty box


    public MyArry()
    {
        length = 5;
        array = new int[length]; // [0][0][0][0][0]
        rightIndex = 0;

    }

     // insert At End

     public void inserAtEnd(int value)
     {
        if(rightIndex == length)
        {
            System.out.println("Array is full ");
            return;
        }
        array[rightIndex] = value;
        rightIndex++; // after inserting at the end size got updated 
     }

     // insert at start 
      public void inserAtStart(int value)
     {
        if(rightIndex == length)
        {
            System.out.println("Array is full ");
            return;
        }
        else
        {
            for( int i = rightIndex-1 ; i >= 0 ;i--)
            {
                array[i+1] = array[i];
            }
        }
        array[0] = value;
        rightIndex++;

       
    }

    //insert at any position 
     public void inserAtPosition(int position , int value)
        {
            
        if(rightIndex == length)
        {
            System.out.println("Array is full ");
            return;
        }

        if(position < 0 || position > rightIndex)
        {
            System.out.println(" Invalid Position ");
        }

        // shift and insert
        for(int i = rightIndex-1 ; i >=  position ; i--)
        {
            array[i+1] = array[i];
            //array[position] = value;
            //rightIndex++;
            
        }
            array[position] = value;
            rightIndex++;
        }

        // printing array
        public void printArray()
        {
            System.out.println("index \t value");
            for(int i = 0 ; i < length;i++)
        {
            System.out.println(i + " \t " +array[i]);
        }
        System.out.println("Size = "+rightIndex);
        System.out.println();

        }

        //delete at end
        public void deleteFromEnd()
        {
            if(rightIndex == 0)
            {
                System.out.println("array is empty");
                return;
            }
            else
            {

                array[rightIndex-1] = 0;
            }
            rightIndex--;
            array[rightIndex] = 0;
        }

        // delete from start
        public void deleteFromStart()
        {
            if(rightIndex == 0)
            {
                System.out.println("array is empty");
                return;
            }
            else
            {

                for(int i = 0; i < rightIndex- 1; i++)
                {
                    array[i] = array[i+1];
                }
                rightIndex--;
                array[rightIndex] = 0;
            }
        }

        

        // delete at any position
        public void deleteAtAnyPosition(int position )
        {
            if(rightIndex == 0)
            {
                 System.out.println("array is empty");
                 return ;
            }
           else if(position < 0 || position > rightIndex)
            {
                System.out.println("invalid position ");
            }

            else
            {
                
                for(int i = position ; i < rightIndex  ; i++)
                {
                    array[i] = array[i+1];
                }
                rightIndex--;
                array[rightIndex] = 0;
            }
        }
}


