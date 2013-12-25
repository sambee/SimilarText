用法：
	
	1. SimilarityBase similarityBase = new SimilarityRate();
	double d = similarityBase.sim("aaa","bbbcccaaa");

	2. SimilarityBase similarityBase = new Distance();
	double d = similarityBase.sim("aaa","bbbcccaaa");

	3. SimilarityBase similarityBase = new CosineSimilarAlgorithm();
	double d = similarityBase.sim("aaa","bbbcccaaa");


本包，提供三种文体比对方法，请参考。