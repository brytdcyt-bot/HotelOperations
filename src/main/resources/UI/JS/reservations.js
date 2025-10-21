document.addEventListener("DOMContentLoaded", () => {
    const section = document.getElementById("reservations");
    section.innerHTML = `
    <h2>Reservation Calculator</h2>
    <form id="resForm">
      <label>Room Type:
        <select id="resType">
          <option value="king">King</option>
          <option value="double">Double</option>
        </select>
      </label>
      <label>Nights: <input type="number" id="resNights" min="1" value="2"></label>
      <label>Weekend: <input type="checkbox" id="resWeekend"></label>
      <button type="submit">Calculate</button>
    </form>
    <p id="resOutput"></p>
  `;

    section.querySelector("#resForm").addEventListener("submit", e => {
        e.preventDefault();
        const type = section.querySelector("#resType").value;
        const nights = parseInt(section.querySelector("#resNights").value);
        const weekend = section.querySelector("#resWeekend").checked;
        let price = type === "king" ? 139 : 124;
        if (weekend) price *= 1.1;
        section.querySelector("#resOutput").textContent =
            `Total: $${(price * nights).toFixed(2)}`;
    });
});