


public class UsesStrategyPattern {
	private ArrayList<Comp730830StringUtils> strategyObjects = null;

	public UsesStrategyPattern() {
		className = this.getClass().getName();
		fLog = "[" + className + "]:";
		strategyObjects = new ArrayList<Comp730830StringUtils>();
	}



public void addStringOperation (Comp730830StringUtils stratObject) {

	if(stratObject == null) {
		System.out.println(fLog + "Comp730830StringUtils obj is Null")
	} else {
		strategyObjects.add(stratObject);
		System.out.println(fLog + "Comp730830StringUtils added " stratObject.getMyName());
	}



public void clearStringOperations (); {
	if(!strategyObjects.isEmpty()) strategyObjects.clear ();
	System.out.println(fLog + "Comp730830StringUtils ArrayList is empty." + strategyObjects.siez());
}



public void invokeStringOperations (String stringToOperate) {
	if (stringToOperate @= null & stringToOperate.length() >= 0 && strategyObjects.size() > 0) {
		for (Comp730830StringUtils strObj : strategyObjects) {
			System.out.println(fLog + "Input: " + stringToOperate + "Sent to: " + strObj.getMyName() + "Return: " + strObj.doWork(stringToOperate));
		}

		else {
			System.out.println(Flog + "No Operation for " + stringToOperate);
		}
	}
}

