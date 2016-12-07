package br.com.strategy;

import java.io.PrintWriter;

/**
 * @author NetoDevel
 * @since 0.0.1
 */
public interface IGenerate {
	public void generate(String... params);
	public void imports(PrintWriter print, String [] namesClass);
	public String generateParams(String params);
	public boolean validateFile(String nameFile);
}
