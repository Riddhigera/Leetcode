class Solution {
    class Worker{
        int qual;
        int wage;
        public Worker(int qual, int wage){
            this.qual = qual;
            this.wage = wage;
        }
    }
    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        int n = quality.length;
        Worker[] workers = new Worker[n];

        for(int i = 0; i < n; i++){
            workers[i] = new Worker(quality[i], wage[i]);
        }
        Arrays.sort(workers, (a, b) -> Double.compare((double) a.wage/a.qual, (double) b.wage/b.qual));

        double minCost = Double.MAX_VALUE;
        int workQual = 0;

        PriorityQueue<Integer> res = new PriorityQueue<>((a, b)-> b-a);
        for(Worker worker : workers){
            workQual += worker.qual;
            res.add(worker.qual);

            if(res.size() > k){
                workQual -= res.poll();
            }
            if(res.size() == k){
                minCost = Math.min(minCost, workQual * ((double) worker.wage / worker.qual));
            }
        }
        return minCost;
    }
}