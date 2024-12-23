public int[] removeDuplicates(int[] arr){
    int[] result = new int[arr.length];
    int index = 0;

    for(int i = 0;i < arr.length;i++){
        boolean duplicate = false;
        for(int j = 0;j < index;j++){
            if(arr[i] == result[j]){
                duplicate = true;
                break;
            }
        }
        if(!duplicate){
            result[index] = arr[i];
            index++;
        }
    }
    int[] trimmedResult = new int[index];
    for(int i = 0;i < index;i++){
        trimmedResult[i] = result[i];
    }
    return trimmedResult;
}