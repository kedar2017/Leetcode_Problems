class GFG{

    public static void main(String[] args){
        int arr[] = {2, 1, 4, 5, 3, 3};
        int N = arr.size();

        int K = 4;

        if(isKPartitionPossible(arr,N,K))
            System.out.println("Partitions into equal sum is possible."); 
        else
            System.out.println("Partitions into equal sum is not possible.");

    }

    public boolean isKPartitionPossible(int arr[], int N, int K){
        if(K==1)
            return true;
        
        if(N<K)
            return false;

        int sum = 0;
        for(int i=0;i<N;i++){
            sum+=arr[i];
        }

        if(sum%K!=0)
            return false;

        int subSet = sum/K;

        int subsetSum[] = new int[K];
        boolean taken[] = new boolean[N];

        for(int i=0;i<K;i++)
            subsetSum[i] = 0;

        for(int j=0;j<N;j++)
            taken[j] = 0;

        subsetSum[0] = arr[N-1];
        taken[N-1] = true;

        return isKPartitionPossibleRec(arr, subsetSum, taken, subset, K, N, 0, N - 1);
    }

    public boolean isKPartitionPossibleRec(int arr[], int subsetSum[], boolean taken[], int subset, int K, int N, int curIdx, int limitIdx){

        if(subsetSum[curIdx] == subSet){
            if(curIdx == K-2)
                return true;
                
            return isKPartitionPossibleRec(arr,subsetSum,taken,subset,K,N,curIdx+1,limitIdx);
        }

        for(int i=limitIdx;i>=0;i--){

            int temp = subsetSum[curIdx] + arr[i];

            if(temp <= subset){
                taken[i] = true;

                subsetSum[curIdx]+=arr[i];

                boolean bln = isKPartitionPossibleRec(arr,subsetSum,taken,subset,K,N,curIdx,i-1);

                taken[i] = false;

                subsetSum[curIdx]-=arr[i];

                if(bln)
                    return true;
            }
        }

        return false;


    }
}