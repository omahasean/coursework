let listItems = [];
let listLoaded = false;

function displayReviews() {
  console.log('displaying')
    // first check to make sure the browser supports content templates
    if ('content' in document.createElement('template')) {
      // query the document for .reviews and assign it to a variable called container
      const container = document.querySelector('.shopping-list');
      // loop over the reviews array
      listItems.forEach(item => {
        console.log('list item')
        // get the template; find all the elements and add the data from our review to each element
        const tmpl = document
          .getElementById('shopping-list-item-template')
          .content.cloneNode(true);
          tmpl.querySelector('li').insertAdjacentHTML('afterbegin', item.name);
        if(item.completed==true){
          tmpl.querySelector('li').classList.add('completed');
          const circle = tmpl.querySelector('.fa-check-circle');
          circle.className += ' completed';
        }
        container.appendChild(tmpl);
      });
      listLoaded=true;
    } else {
      console.error('Your browser does not support templates');
    }
  }
function loadList() {
  console.log('Loading list')
    fetch('assets/data/shopping-list.json')
      .then(response => {
        console.log('Response')
        return response.json();
      })
      .then(data => {
        console.log(data);
        listItems = data;
        displayReviews();
      })
      .catch(error => console.error(error));
  }
    
  function handleLoadListClicked(evt) {
    console.log('Click!')
      if(listLoaded==false){
        loadList();
      }
  }
  
  document.addEventListener('DOMContentLoaded', () => {
    document
      .querySelector('.loadingButton')
      .addEventListener('click', handleLoadListClicked);
  });