from selenium import webdriver
import sys
""" import logging

from selenium.webdriver.common.desired_capabilities import DesiredCapabilities
d = DesiredCapabilities.CHROME
d['loggingPrefs'] = {'performance': 'ALL'}
 """

url = sys.argv[1]

print("Starting Selenium Test for URL: "+url)

#  ChromeOptions
chrome_options = webdriver.ChromeOptions()
chrome_options.add_argument('--headless')
chrome_options.add_argument('--no-sandbox') # required when running as root user. otherwise you would get no sandbox errors.
driver = webdriver.Chrome(options=chrome_options)
driver.get(url)
""" print(driver.title)

print(driver.page_source) """
for request in driver.requests:
    if request.response:
        print(
            request.url,
            request.response.status_code,
            request.response.headers['Content-Type']
        )

print("Selenium Test Finished")