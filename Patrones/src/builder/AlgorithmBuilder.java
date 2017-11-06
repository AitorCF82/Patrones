package builder;

public class AlgorithmBuilder {
	
	private String name;
	private int maximumNumberOfEvaluations;
	private int maximumComputingTime;
	private int memoryRequirement;
	private String operator;
	
	public AlgorithmBuilder() {
		
	}
	
	public AlgorithmBuilder setName(String Name) {
		this.name = name;
		return this;
	}
	
	public AlgorithmBuilder setMaximumNumberofEvalutations(int maximumNumberofEvaluations) {
		this.maximumNumberOfEvaluations = maximumNumberOfEvaluations;
		return this;
		
	}
	
	public AlgorithmBuilder setMaximumComputingTime(int maximumComputingTime) {
		this.maximumComputingTime = maximumComputingTime;
		return this;
	}
	
	public AlgorithmBuilder setMemoryRequierement(int memoryRequirement) {
		this.memoryRequirement = memoryRequirement;
		return this;
	}
	public AlgorithmBuilder setOperator(String operator) {
		this.operator = operator;
		return this;
	}
	public Algorithm build() {
		return new Algorithm(name,maximumNumberOfEvaluations,maximumComputingTime,memoryRequirement,operator);
	}

}
