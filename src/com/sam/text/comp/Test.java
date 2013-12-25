package com.sam.text.comp;

import cn.bob.similarity.CosineSimilarAlgorithm;
import cn.bob.similarity.Distance;
import cn.bob.similarity.SimilarityBase;
import cn.bob.similarity.SimilarityRate;


public class Test {

	public static void main(String[] args){
		SimilarityBase similarityBase = new SimilarityRate();
		double d = similarityBase.sim("aaa","bbbcccaaa");
		System.out.println("----" + d);
		
		similarityBase = new Distance();
		d = similarityBase.sim("aaa","bbbcccaaa");
		System.out.println("----" + d);
		
		similarityBase = new CosineSimilarAlgorithm();
		d = similarityBase.sim("aaa","bbbcccaaa");
		System.out.println("----" + d);
	}
}
