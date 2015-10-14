package com.takeawalk.templates;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Properties;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.springframework.core.io.ClassPathResource;

public class VoleTemplate {

	public VoleTemplate(String basePath, String name, OutputStream out) throws IOException {

//		Properties p = new Properties();
		// 设置输入输出编码类型。和这次说的解决的问题无关
//		p.setProperty(Velocity.INPUT_ENCODING, "UTF-8");
//		p.setProperty(Velocity.OUTPUT_ENCODING, "UTF-8");
//		p.setProperty("file.resource.loader.class", "org.apache.velocity.runtime.resource.loader.FileResourceLoader");
		// 也可以用下面方法指定一个绝对路径，不过这样要求你所有的模板都放在该路径下，是有局限的
//		 p.setProperty(Velocity.FILE_RESOURCE_LOADER_PATH, "/templates");
		
//		Velocity.init(p);
		ClassPathResource resource = new ClassPathResource("velocity.properties");
		
		Properties p = new Properties();
		p.load(resource.getInputStream());
		
		Velocity.init(p);

		VelocityContext context = new VelocityContext();

		context.put("name", "this is a test.");

		Template template = null;

		template = Velocity.getTemplate(name);

		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out));

		template.merge(context, writer);
		
		writer.flush();
		writer.close();
	}
	
	public static void main(String[] args) {
		System.out.println(System.getProperty("user.dir"));
	}
}
