package resourcebundle.inspector.validator;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Collection;

import org.testng.annotations.Test;

import de.alpharogroup.file.exceptions.FileIsADirectoryException;
import de.alpharogroup.file.search.PathFinder;
import de.alpharogroup.lang.ClassUtils;


public class PropertiesNormalizerTest {

	@Test
	public void testNormalizeProperties() throws URISyntaxException, IOException, FileIsADirectoryException {

    	final String propertiesFilename = "resources.properties";
		File propertiesFile = ClassUtils.getResourceAsFile(propertiesFilename);
		PropertiesNormalizer.normalizeProperties(propertiesFile.getAbsolutePath()); 
	}

	@Test
	public void testConvertFiles() throws IOException {
		File dir = PathFinder.getSrcTestResourcesDir();
		Collection<File> r= PropertiesNormalizer.findPropertiesFilesWithInvalidCharacters(dir);
		System.out.println(r);
	}

	@Test
	public void testFindPropertiesFilesWithInvalidCharacters() throws IOException {
		File dir = PathFinder.getSrcTestResourcesDir();
		Collection<File> r= PropertiesNormalizer.findPropertiesFilesWithInvalidCharacters(dir);
		System.out.println(r);
	}
	
	

}