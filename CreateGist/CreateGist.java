// Instantiate the Choreo, using a previously instantiated TembooSession object, eg:
// TembooSession session = new TembooSession("accountName", "myFirstApp", "abc123xxxxxxxxxxxxxx");

CreateGist createGistChoreo = new CreateGist(session);

// Get an InputSet object for the choreo
CreateGistInputSet createGistInputs = createGistChoreo.newInputSet();

// Set credential to use for execution
createGistInputs.setCredential("h");

// Set inputs

// Execute Choreo
CreateGistResultSet createGistResults = createGistChoreo.execute(createGistInputs);