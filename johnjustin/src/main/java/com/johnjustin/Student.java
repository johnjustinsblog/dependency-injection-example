/*
 * #%L
 * johnjustin
 * $Id:$
 * $HeadURL:$
 * %%
 * Copyright (C) 2016 John Justin
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
/**
 * 
 */
package com.johnjustin;
import com.johnjustin.AssessmentService;
import com.google.inject.Inject;

/**
 * @author John Justin
 *
 */
public class Student {

	private final AssessmentService assessmentService;
	
	@Inject
	private Student(AssessmentService assessmentService){
		
		this.assessmentService = assessmentService;
	}	
	
	public void attendExam() {
			assessmentService.writeTest("Engineering", "Mathematics");
		  }
		
	
}
