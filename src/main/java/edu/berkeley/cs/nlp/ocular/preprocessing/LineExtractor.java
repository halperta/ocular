package edu.berkeley.cs.nlp.ocular.preprocessing;

import java.util.List;

public interface LineExtractor {

	public List<double[][]> extractLines(double[][] levels);

}
