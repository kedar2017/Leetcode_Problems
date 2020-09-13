public boolean judgePoint24(int nums[]){
    List<Double> list = new ArrayList<>();
    for(int i:nums){
        list.add((double) i);
    }

    return dfs(list);
}

public boolean dfs(List<Double> list){
    if(list.size()==1){
        if(Math.abs(list.get(0)-24.0) < 0.001){
            return true;
        }

        else
            return false;
    }

    for(int i=0;i<list.size();i++){
        for(int j=0;j<i;j++){
            for(double c:generatePossibilities(list.get(i),list.get(j))){
                List<Double> nL = new ArrayList<>();

                for(int k=0;k<list.size();k++){
                    if(k == i || k == j) continue;

                    nL.add(list.get(k));
                }

                nl.add(c);

                if(dfs(nL)) return true;
            }
        }
    }


}

public List<Double> generatePossibilities(double a, double b){
    List<Double> gp = new ArrayList<>();

    gp.add(a + b);
    gp.add(a - b);
    gp.add(b - a);
    gp.add(a * b);
    gp.add(a / b);
    gp.add(b / a);

    return gp;
}