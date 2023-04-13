public class task3 {
    
    public static int[] getArray(){
        int[] firstArray = {18, 6, -1, 28, 12, -1, 0, 3, 1}; // Test: firstArray на 1 элемент больше secondArray
        int[] secondArray = {1, -2, 24, -20, 14, -5, 2, 20}; // Test: в secondArray можно добавить ноль
        int[] resultArray = new int[firstArray.length];
        
        try {
            for(int x = 0; x < resultArray.length; x++){
                resultArray[x] = firstArray[x] / secondArray[x];
            }
        } catch (IndexOutOfBoundsException e){
            System.err.println("Error: индекс вне границ массива!");
        } catch (ArithmeticException e){
            System.err.println("Error: деление на ноль!");
        }
        return resultArray;
    }
    // Исполняемая программа
    public static void main(String[] args) throws Exception{
                
        int[] resultArray = getArray();
        for(int i: resultArray)
            System.out.print(i + " ");

    }
}
