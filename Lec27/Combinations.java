package Lec27;

import java.util.ArrayList;

public class Combinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
		Queencombination(4, 0, 2, 0, list, ans);
		System.out.println(ans);
		
		
		

	}

	public static void Queencombination(int n, int last_index, int tq, int qpsf, ArrayList<Integer> list,
			ArrayList<ArrayList<Integer>> ans) {
		// TODO Auto-generated method stub
		if (tq == qpsf) {
			ans.add(new ArrayList<>(list));
			return;
		}

		for (int i = last_index + 1; i <=n; i++) {
			
				list.add(i);
				Queencombination(n, i, tq, qpsf + 1, list, ans);
				
				list.remove(list.size() - 1);
			}

		}

	}


