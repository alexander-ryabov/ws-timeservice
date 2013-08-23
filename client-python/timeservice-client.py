import suds

class Client:
    def __init__(self):
        self.client = suds.client.Client("http://127.0.0.1:9000/timeserver?wsdl")

    def getTimeAsString(self):
        return self.client.service.getTimeAsString()
        
    def getTimeAsLong(self):
        return self.client.service.getTimeAsLong()

        
if(__name__ == "__main__"):
    client = Client()
    print("Time as string:", client.getTimeAsString())
    print("Time as long:  ", client.getTimeAsLong())
